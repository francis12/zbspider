package com.zxm.spider.webmagic.pipeline;

import com.zxm.spider.constants.BaseConstants;
import com.zxm.spider.mapper.BasicVODAO;
import com.zxm.spider.mapper.CmsArticleVODAO;
import com.zxm.spider.mapper.DiyGameVODAO;
import com.zxm.spider.model.BasicVO;
import com.zxm.spider.model.CmsArticleVO;
import com.zxm.spider.model.DiyGameVO;
import com.zxm.spider.model.DiyGameVOCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.io.File;
import java.util.Date;

@Component
public class DiyGameDaoPipeLine  implements Pipeline {

    @Autowired
    DiyGameVODAO diyGameVODAO;
    @Autowired
    BasicVODAO basicVODAO;
    @Autowired
    CmsArticleVODAO cmsArticleVODAO;
    @Override
    public void process(ResultItems resultItems, Task task) {
        DiyGameVO vo = (DiyGameVO) resultItems.get("leqiubaVO");
        if(null != vo) {
            DiyGameVOCondition condition = new DiyGameVOCondition();
            condition.createCriteria().andGametimeEqualTo(vo.getGametime()).andHostEqualTo(vo.getHost()).andGuestEqualTo(vo.getGuest());
            int cnt = diyGameVODAO.countByCondition(condition);
            if(cnt ==0) {

                //1插入基本表
                BasicVO basicVO = new BasicVO();
                basicVO.setBasicAppid(BaseConstants.APP_ID);
                basicVO.setBasicHit(0l);
                basicVO.setBasicSort(0);
                basicVO.setBasicDatetime(new Date());
                basicVO.setBasicUpdatetime(new Date());
                basicVO.setBasicPeopleid(0);
                basicVO.setBasicCategoryid((Integer) resultItems.get("categoryid"));
                basicVO.setBasicModelid(BaseConstants.MODEL_ID);
                basicVO.setBasicDisplay(0);
                basicVO.setBasicTitle( vo.getGuest() +" VS " + vo.getHost());
                basicVODAO.insert(basicVO);

                //2插入article表
                CmsArticleVO cmsArticleVO = new CmsArticleVO();
                cmsArticleVO.setArticleBasicid(basicVO.getBasicId());
                cmsArticleVO.setArticleAuthor(BaseConstants.ARTICLE_LEQIUBA_AUTHTOR);
                cmsArticleVO.setArticleFreeorder(0);
                cmsArticleVO.setArticleType("");
                cmsArticleVO.setArticleKeyword("");
                cmsArticleVO.setArticleWebid(BaseConstants.APP_ID);

                cmsArticleVODAO.insert(cmsArticleVO);
                String articleUrl = BaseConstants.ARTICLE_URL_TODAY_PRIFIX+ File.separator+cmsArticleVO.getArticleBasicid()+".html";
                cmsArticleVO.setArticleUrl(articleUrl);
                cmsArticleVODAO.updateByPrimaryKey(cmsArticleVO);

                //3插入diy表
                vo.setBasicid(basicVO.getBasicId());
                diyGameVODAO.insert(vo);
            } else {
                diyGameVODAO.updateByCondition(vo,condition);
            }
        }
    }
}
