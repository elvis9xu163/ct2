package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.SubscribeDo;
import com.xjd.ct.dal.dos.SubscribeDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubscribeDoMapper {
    int countByExample(SubscribeDoExample example);

    int deleteByExample(SubscribeDoExample example);

    int deleteByPrimaryKey(Long subscribeId);

    int insert(SubscribeDo record);

    int insertSelective(SubscribeDo record);

    List<SubscribeDo> selectByExample(SubscribeDoExample example);

    SubscribeDo selectByPrimaryKey(Long subscribeId);

    int updateByExampleSelective(@Param("record") SubscribeDo record, @Param("example") SubscribeDoExample example);

    int updateByExample(@Param("record") SubscribeDo record, @Param("example") SubscribeDoExample example);

    int updateByPrimaryKeySelective(SubscribeDo record);

    int updateByPrimaryKey(SubscribeDo record);
}