package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.UserAgeBracketDo;
import com.xjd.ct.dal.dos.UserAgeBracketDoExample;
import com.xjd.ct.dal.dos.UserAgeBracketDoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAgeBracketDoMapper {
    int countByExample(UserAgeBracketDoExample example);

    int deleteByExample(UserAgeBracketDoExample example);

    int deleteByPrimaryKey(UserAgeBracketDoKey key);

    int insert(UserAgeBracketDo record);

    int insertSelective(UserAgeBracketDo record);

    List<UserAgeBracketDo> selectByExample(UserAgeBracketDoExample example);

    UserAgeBracketDo selectByPrimaryKey(UserAgeBracketDoKey key);

    int updateByExampleSelective(@Param("record") UserAgeBracketDo record, @Param("example") UserAgeBracketDoExample example);

    int updateByExample(@Param("record") UserAgeBracketDo record, @Param("example") UserAgeBracketDoExample example);

    int updateByPrimaryKeySelective(UserAgeBracketDo record);

    int updateByPrimaryKey(UserAgeBracketDo record);
}