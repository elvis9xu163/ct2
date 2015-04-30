package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectVoteOptDo;
import com.xjd.ct.dal.dos.ObjectVoteOptDoExample;
import com.xjd.ct.dal.dos.ObjectVoteOptDoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectVoteOptDoMapper {
    int countByExample(ObjectVoteOptDoExample example);

    int deleteByExample(ObjectVoteOptDoExample example);

    int deleteByPrimaryKey(ObjectVoteOptDoKey key);

    int insert(ObjectVoteOptDo record);

    int insertSelective(ObjectVoteOptDo record);

    List<ObjectVoteOptDo> selectByExample(ObjectVoteOptDoExample example);

    ObjectVoteOptDo selectByPrimaryKey(ObjectVoteOptDoKey key);

    int updateByExampleSelective(@Param("record") ObjectVoteOptDo record, @Param("example") ObjectVoteOptDoExample example);

    int updateByExample(@Param("record") ObjectVoteOptDo record, @Param("example") ObjectVoteOptDoExample example);

    int updateByPrimaryKeySelective(ObjectVoteOptDo record);

    int updateByPrimaryKey(ObjectVoteOptDo record);
}