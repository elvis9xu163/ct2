package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.AppVersionDo;
import com.xjd.ct.dal.dos.AppVersionDoExample;
import com.xjd.ct.dal.dos.AppVersionDoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppVersionDoMapper {
    int countByExample(AppVersionDoExample example);

    int deleteByExample(AppVersionDoExample example);

    int deleteByPrimaryKey(AppVersionDoKey key);

    int insert(AppVersionDo record);

    int insertSelective(AppVersionDo record);

    List<AppVersionDo> selectByExample(AppVersionDoExample example);

    AppVersionDo selectByPrimaryKey(AppVersionDoKey key);

    int updateByExampleSelective(@Param("record") AppVersionDo record, @Param("example") AppVersionDoExample example);

    int updateByExample(@Param("record") AppVersionDo record, @Param("example") AppVersionDoExample example);

    int updateByPrimaryKeySelective(AppVersionDo record);

    int updateByPrimaryKey(AppVersionDo record);
}