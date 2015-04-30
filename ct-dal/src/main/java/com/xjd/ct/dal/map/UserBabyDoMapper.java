package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.UserBabyDo;
import com.xjd.ct.dal.dos.UserBabyDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBabyDoMapper {
    int countByExample(UserBabyDoExample example);

    int deleteByExample(UserBabyDoExample example);

    int deleteByPrimaryKey(Long babyId);

    int insert(UserBabyDo record);

    int insertSelective(UserBabyDo record);

    List<UserBabyDo> selectByExample(UserBabyDoExample example);

    UserBabyDo selectByPrimaryKey(Long babyId);

    int updateByExampleSelective(@Param("record") UserBabyDo record, @Param("example") UserBabyDoExample example);

    int updateByExample(@Param("record") UserBabyDo record, @Param("example") UserBabyDoExample example);

    int updateByPrimaryKeySelective(UserBabyDo record);

    int updateByPrimaryKey(UserBabyDo record);
}