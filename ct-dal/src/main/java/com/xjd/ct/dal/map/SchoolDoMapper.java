package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.SchoolDo;
import com.xjd.ct.dal.dos.SchoolDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolDoMapper {
    int countByExample(SchoolDoExample example);

    int deleteByExample(SchoolDoExample example);

    int deleteByPrimaryKey(Long objectId);

    int insert(SchoolDo record);

    int insertSelective(SchoolDo record);

    List<SchoolDo> selectByExample(SchoolDoExample example);

    SchoolDo selectByPrimaryKey(Long objectId);

    int updateByExampleSelective(@Param("record") SchoolDo record, @Param("example") SchoolDoExample example);

    int updateByExample(@Param("record") SchoolDo record, @Param("example") SchoolDoExample example);

    int updateByPrimaryKeySelective(SchoolDo record);

    int updateByPrimaryKey(SchoolDo record);
}