package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.UserResourceDo;
import com.xjd.ct.dal.dos.UserResourceDoExample;
import com.xjd.ct.dal.dos.UserResourceDoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserResourceDoMapper {
    int countByExample(UserResourceDoExample example);

    int deleteByExample(UserResourceDoExample example);

    int deleteByPrimaryKey(UserResourceDoKey key);

    int insert(UserResourceDo record);

    int insertSelective(UserResourceDo record);

    List<UserResourceDo> selectByExample(UserResourceDoExample example);

    UserResourceDo selectByPrimaryKey(UserResourceDoKey key);

    int updateByExampleSelective(@Param("record") UserResourceDo record, @Param("example") UserResourceDoExample example);

    int updateByExample(@Param("record") UserResourceDo record, @Param("example") UserResourceDoExample example);

    int updateByPrimaryKeySelective(UserResourceDo record);

    int updateByPrimaryKey(UserResourceDo record);
}