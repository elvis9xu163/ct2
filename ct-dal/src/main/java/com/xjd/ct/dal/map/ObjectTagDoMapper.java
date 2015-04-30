package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectTagDo;
import com.xjd.ct.dal.dos.ObjectTagDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectTagDoMapper {
    int countByExample(ObjectTagDoExample example);

    int deleteByExample(ObjectTagDoExample example);

    int insert(ObjectTagDo record);

    int insertSelective(ObjectTagDo record);

    List<ObjectTagDo> selectByExample(ObjectTagDoExample example);

    int updateByExampleSelective(@Param("record") ObjectTagDo record, @Param("example") ObjectTagDoExample example);

    int updateByExample(@Param("record") ObjectTagDo record, @Param("example") ObjectTagDoExample example);
}