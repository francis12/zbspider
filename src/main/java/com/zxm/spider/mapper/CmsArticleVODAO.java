package com.zxm.spider.mapper;

import com.zxm.spider.model.CmsArticleVO;
import com.zxm.spider.model.CmsArticleVOCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsArticleVODAO {
    int countByCondition(CmsArticleVOCondition example);

    int deleteByCondition(CmsArticleVOCondition example);

    int deleteByPrimaryKey(Integer articleBasicid);

    int insert(CmsArticleVO record);

    int insertSelective(CmsArticleVO record);

    List<CmsArticleVO> selectByExampleWithBLOBs(CmsArticleVOCondition example);

    List<CmsArticleVO> selectByCondition(CmsArticleVOCondition example);

    CmsArticleVO selectByPrimaryKey(Integer articleBasicid);

    int updateByConditionSelective(@Param("record") CmsArticleVO record, @Param("example") CmsArticleVOCondition example);

    int updateByExampleWithBLOBs(@Param("record") CmsArticleVO record, @Param("example") CmsArticleVOCondition example);

    int updateByCondition(@Param("record") CmsArticleVO record, @Param("example") CmsArticleVOCondition example);

    int updateByPrimaryKeySelective(CmsArticleVO record);

    int updateByPrimaryKeyWithBLOBs(CmsArticleVO record);

    int updateByPrimaryKey(CmsArticleVO record);
}