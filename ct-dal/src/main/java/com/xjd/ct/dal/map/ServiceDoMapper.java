package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ServiceDo;
import com.xjd.ct.dal.dos.ServiceDoExample;
import com.xjd.ct.dal.dos.ServiceDoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceDoMapper {
    int countByExample(ServiceDoExample example);

    int deleteByExample(ServiceDoExample example);

    int deleteByPrimaryKey(ServiceDoKey key);

    int insert(ServiceDo record);

    int insertSelective(ServiceDo record);

    List<ServiceDo> selectByExample(ServiceDoExample example);

    ServiceDo selectByPrimaryKey(ServiceDoKey key);

    int updateByExampleSelective(@Param("record") ServiceDo record, @Param("example") ServiceDoExample example);

    int updateByExample(@Param("record") ServiceDo record, @Param("example") ServiceDoExample example);

    int updateByPrimaryKeySelective(ServiceDo record);

    int updateByPrimaryKey(ServiceDo record);
}