package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.RecommendDo;
import com.xjd.ct.dal.dos.RecommendDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecommendDoMapper {
    int countByExample(RecommendDoExample example);

    int deleteByExample(RecommendDoExample example);

    int deleteByPrimaryKey(Long recommendId);

    int insert(RecommendDo record);

    int insertSelective(RecommendDo record);

    List<RecommendDo> selectByExample(RecommendDoExample example);

    RecommendDo selectByPrimaryKey(Long recommendId);

    int updateByExampleSelective(@Param("record") RecommendDo record, @Param("example") RecommendDoExample example);

    int updateByExample(@Param("record") RecommendDo record, @Param("example") RecommendDoExample example);

    int updateByPrimaryKeySelective(RecommendDo record);

    int updateByPrimaryKey(RecommendDo record);
}