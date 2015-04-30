package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ResourceDo;
import com.xjd.ct.dal.dos.ResourceDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceDoMapper {
    int countByExample(ResourceDoExample example);

    int deleteByExample(ResourceDoExample example);

    int deleteByPrimaryKey(String resId);

    int insert(ResourceDo record);

    int insertSelective(ResourceDo record);

    List<ResourceDo> selectByExample(ResourceDoExample example);

    ResourceDo selectByPrimaryKey(String resId);

    int updateByExampleSelective(@Param("record") ResourceDo record, @Param("example") ResourceDoExample example);

    int updateByExample(@Param("record") ResourceDo record, @Param("example") ResourceDoExample example);

    int updateByPrimaryKeySelective(ResourceDo record);

    int updateByPrimaryKey(ResourceDo record);
}