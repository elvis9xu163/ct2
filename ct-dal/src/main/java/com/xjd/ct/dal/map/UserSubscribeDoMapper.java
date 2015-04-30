package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.UserSubscribeDo;
import com.xjd.ct.dal.dos.UserSubscribeDoExample;
import com.xjd.ct.dal.dos.UserSubscribeDoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSubscribeDoMapper {
    int countByExample(UserSubscribeDoExample example);

    int deleteByExample(UserSubscribeDoExample example);

    int deleteByPrimaryKey(UserSubscribeDoKey key);

    int insert(UserSubscribeDo record);

    int insertSelective(UserSubscribeDo record);

    List<UserSubscribeDo> selectByExample(UserSubscribeDoExample example);

    UserSubscribeDo selectByPrimaryKey(UserSubscribeDoKey key);

    int updateByExampleSelective(@Param("record") UserSubscribeDo record, @Param("example") UserSubscribeDoExample example);

    int updateByExample(@Param("record") UserSubscribeDo record, @Param("example") UserSubscribeDoExample example);

    int updateByPrimaryKeySelective(UserSubscribeDo record);

    int updateByPrimaryKey(UserSubscribeDo record);
}