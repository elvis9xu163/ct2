package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.AgeBracketDo;
import com.xjd.ct.dal.dos.AgeBracketDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgeBracketDoMapper {
    int countByExample(AgeBracketDoExample example);

    int deleteByExample(AgeBracketDoExample example);

    int deleteByPrimaryKey(Long ageBracketId);

    int insert(AgeBracketDo record);

    int insertSelective(AgeBracketDo record);

    List<AgeBracketDo> selectByExample(AgeBracketDoExample example);

    AgeBracketDo selectByPrimaryKey(Long ageBracketId);

    int updateByExampleSelective(@Param("record") AgeBracketDo record, @Param("example") AgeBracketDoExample example);

    int updateByExample(@Param("record") AgeBracketDo record, @Param("example") AgeBracketDoExample example);

    int updateByPrimaryKeySelective(AgeBracketDo record);

    int updateByPrimaryKey(AgeBracketDo record);
}