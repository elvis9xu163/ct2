package com.xjd.ct.dal.map;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xjd.ct.dal.dos.SignDo;
import com.xjd.ct.dal.dos.SignDoExample;

public interface SignDoMapper {
    int countByExample(SignDoExample example);

    int deleteByExample(SignDoExample example);

    int deleteByPrimaryKey(Long signId);

    int insert(SignDo record);

    int insertSelective(SignDo record);

    List<SignDo> selectByExample(SignDoExample example);

    SignDo selectByPrimaryKey(Long signId);

    int updateByExampleSelective(@Param("record") SignDo record, @Param("example") SignDoExample example);

    int updateByExample(@Param("record") SignDo record, @Param("example") SignDoExample example);

    int updateByPrimaryKeySelective(SignDo record);

    int updateByPrimaryKey(SignDo record);
}