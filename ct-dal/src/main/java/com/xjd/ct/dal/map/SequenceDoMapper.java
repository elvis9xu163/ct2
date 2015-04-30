package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.SequenceDo;
import com.xjd.ct.dal.dos.SequenceDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceDoMapper {
    int countByExample(SequenceDoExample example);

    int deleteByExample(SequenceDoExample example);

    int deleteByPrimaryKey(String seqName);

    int insert(SequenceDo record);

    int insertSelective(SequenceDo record);

    List<SequenceDo> selectByExample(SequenceDoExample example);

    SequenceDo selectByPrimaryKey(String seqName);

    int updateByExampleSelective(@Param("record") SequenceDo record, @Param("example") SequenceDoExample example);

    int updateByExample(@Param("record") SequenceDo record, @Param("example") SequenceDoExample example);

    int updateByPrimaryKeySelective(SequenceDo record);

    int updateByPrimaryKey(SequenceDo record);
}