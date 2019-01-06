package com.zxm.spider.mapper;

import com.zxm.spider.model.BasicVO;
import com.zxm.spider.model.BasicVOCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicVODAO {
    int countByCondition(BasicVOCondition example);

    int deleteByPrimaryKey(Integer basicId);

    int insert(BasicVO record);

    int insertSelective(BasicVO record);

    List<BasicVO> selectByExampleWithBLOBs(BasicVOCondition example);

    List<BasicVO> selectByCondition(BasicVOCondition example);

    BasicVO selectByPrimaryKey(Integer basicId);

    int updateByConditionSelective(@Param("record") BasicVO record, @Param("example") BasicVOCondition example);

    int updateByExampleWithBLOBs(@Param("record") BasicVO record, @Param("example") BasicVOCondition example);

    int updateByCondition(@Param("record") BasicVO record, @Param("example") BasicVOCondition example);

    int updateByPrimaryKeySelective(BasicVO record);

    int updateByPrimaryKeyWithBLOBs(BasicVO record);

    int updateByPrimaryKey(BasicVO record);
}