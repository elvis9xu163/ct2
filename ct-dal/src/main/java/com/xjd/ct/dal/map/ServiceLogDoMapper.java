package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ServiceLogDo;
import com.xjd.ct.dal.dos.ServiceLogDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceLogDoMapper {
    int countByExample(ServiceLogDoExample example);

    int deleteByExample(ServiceLogDoExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(ServiceLogDo record);

    int insertSelective(ServiceLogDo record);

    List<ServiceLogDo> selectByExample(ServiceLogDoExample example);

    ServiceLogDo selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") ServiceLogDo record, @Param("example") ServiceLogDoExample example);

    int updateByExample(@Param("record") ServiceLogDo record, @Param("example") ServiceLogDoExample example);

    int updateByPrimaryKeySelective(ServiceLogDo record);

    int updateByPrimaryKey(ServiceLogDo record);
}