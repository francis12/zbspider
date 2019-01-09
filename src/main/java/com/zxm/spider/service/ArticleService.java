package com.zxm.spider.service;

import com.zxm.spider.mapper.BasicVODAO;
import com.zxm.spider.mapper.CmsArticleVODAO;
import com.zxm.spider.mapper.DiyGameVODAO;
import com.zxm.spider.model.BasicVO;
import com.zxm.spider.model.BasicVOCondition;
import com.zxm.spider.model.CmsArticleVOCondition;
import com.zxm.spider.model.DiyGameVOCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    @Autowired
    DiyGameVODAO diyGameVODAO;
    @Autowired
    BasicVODAO basicVODAO;
    @Autowired
    CmsArticleVODAO cmsArticleVODAO;

    public void deleteArticlesFromCategorys(List<Integer> categoryIds){
        BasicVOCondition basicVOCondition = new BasicVOCondition();
        basicVOCondition.createCriteria().andBasicCategoryidIn(categoryIds);
        List<BasicVO> basicVOList = basicVODAO.selectByCondition(basicVOCondition);

        List<Integer> basicIdList = new ArrayList<>();
        basicVOList.stream().forEach(item -> {
            basicIdList.add(item.getBasicId());
        });
        if(null != basicIdList && basicIdList.size() > 0) {
            CmsArticleVOCondition cmsArticleVOCondition = new CmsArticleVOCondition();
            cmsArticleVOCondition.createCriteria().andArticleBasicidIn(basicIdList);
            cmsArticleVODAO.deleteByCondition(cmsArticleVOCondition);

            DiyGameVOCondition diyGameVOCondition = new DiyGameVOCondition();
            diyGameVOCondition.createCriteria().andBasicidIn(basicIdList);
            diyGameVODAO.deleteByCondition(diyGameVOCondition);

            basicVODAO.deleteByCondition(basicVOCondition);
        }
    }
}
