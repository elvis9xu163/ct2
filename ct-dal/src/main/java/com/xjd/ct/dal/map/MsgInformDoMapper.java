package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.MsgInformDo;
import com.xjd.ct.dal.dos.MsgInformDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgInformDoMapper {
    int countByExample(MsgInformDoExample example);

    int deleteByExample(MsgInformDoExample example);

    int deleteByPrimaryKey(Long informId);

    int insert(MsgInformDo record);

    int insertSelective(MsgInformDo record);

    List<MsgInformDo> selectByExample(MsgInformDoExample example);

    MsgInformDo selectByPrimaryKey(Long informId);

    int updateByExampleSelective(@Param("record") MsgInformDo record, @Param("example") MsgInformDoExample example);

    int updateByExample(@Param("record") MsgInformDo record, @Param("example") MsgInformDoExample example);

    int updateByPrimaryKeySelective(MsgInformDo record);

    int updateByPrimaryKey(MsgInformDo record);
}