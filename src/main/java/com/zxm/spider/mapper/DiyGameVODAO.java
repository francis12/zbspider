package com.zxm.spider.mapper;

import com.zxm.spider.model.DiyGameVO;
import com.zxm.spider.model.DiyGameVOCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiyGameVODAO {
    int countByCondition(DiyGameVOCondition example);

    int deleteByCondition(DiyGameVOCondition example);

    int deleteByPrimaryKey(Integer basicid);

    int insert(DiyGameVO record);

    int insertSelective(DiyGameVO record);

    List<DiyGameVO> selectByCondition(DiyGameVOCondition example);

    DiyGameVO selectByPrimaryKey(Integer basicid);

    int updateByConditionSelective(@Param("record") DiyGameVO record, @Param("example") DiyGameVOCondition example);

    int updateByCondition(@Param("record") DiyGameVO record, @Param("example") DiyGameVOCondition example);

    int updateByPrimaryKeySelective(DiyGameVO record);

    int updateByPrimaryKey(DiyGameVO record);
}