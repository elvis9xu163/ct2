package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.LaunchPicDo;
import com.xjd.ct.dal.dos.LaunchPicDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LaunchPicDoMapper {
    int countByExample(LaunchPicDoExample example);

    int deleteByExample(LaunchPicDoExample example);

    int deleteByPrimaryKey(Long launchId);

    int insert(LaunchPicDo record);

    int insertSelective(LaunchPicDo record);

    List<LaunchPicDo> selectByExample(LaunchPicDoExample example);

    LaunchPicDo selectByPrimaryKey(Long launchId);

    int updateByExampleSelective(@Param("record") LaunchPicDo record, @Param("example") LaunchPicDoExample example);

    int updateByExample(@Param("record") LaunchPicDo record, @Param("example") LaunchPicDoExample example);

    int updateByPrimaryKeySelective(LaunchPicDo record);

    int updateByPrimaryKey(LaunchPicDo record);
}