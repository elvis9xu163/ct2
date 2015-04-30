package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectResourceDo;
import com.xjd.ct.dal.dos.ObjectResourceDoExample;
import com.xjd.ct.dal.dos.ObjectResourceDoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectResourceDoMapper {
    int countByExample(ObjectResourceDoExample example);

    int deleteByExample(ObjectResourceDoExample example);

    int deleteByPrimaryKey(ObjectResourceDoKey key);

    int insert(ObjectResourceDo record);

    int insertSelective(ObjectResourceDo record);

    List<ObjectResourceDo> selectByExample(ObjectResourceDoExample example);

    ObjectResourceDo selectByPrimaryKey(ObjectResourceDoKey key);

    int updateByExampleSelective(@Param("record") ObjectResourceDo record, @Param("example") ObjectResourceDoExample example);

    int updateByExample(@Param("record") ObjectResourceDo record, @Param("example") ObjectResourceDoExample example);

    int updateByPrimaryKeySelective(ObjectResourceDo record);

    int updateByPrimaryKey(ObjectResourceDo record);
}