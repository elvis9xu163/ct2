package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectVoteDo;
import com.xjd.ct.dal.dos.ObjectVoteDoExample;
import com.xjd.ct.dal.dos.ObjectVoteDoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectVoteDoMapper {
    int countByExample(ObjectVoteDoExample example);

    int deleteByExample(ObjectVoteDoExample example);

    int deleteByPrimaryKey(ObjectVoteDoKey key);

    int insert(ObjectVoteDo record);

    int insertSelective(ObjectVoteDo record);

    List<ObjectVoteDo> selectByExample(ObjectVoteDoExample example);

    ObjectVoteDo selectByPrimaryKey(ObjectVoteDoKey key);

    int updateByExampleSelective(@Param("record") ObjectVoteDo record, @Param("example") ObjectVoteDoExample example);

    int updateByExample(@Param("record") ObjectVoteDo record, @Param("example") ObjectVoteDoExample example);

    int updateByPrimaryKeySelective(ObjectVoteDo record);

    int updateByPrimaryKey(ObjectVoteDo record);
}