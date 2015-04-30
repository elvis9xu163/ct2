package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.IdolDo;
import com.xjd.ct.dal.dos.IdolDoExample;
import com.xjd.ct.dal.dos.IdolDoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdolDoMapper {
    int countByExample(IdolDoExample example);

    int deleteByExample(IdolDoExample example);

    int deleteByPrimaryKey(IdolDoKey key);

    int insert(IdolDo record);

    int insertSelective(IdolDo record);

    List<IdolDo> selectByExample(IdolDoExample example);

    IdolDo selectByPrimaryKey(IdolDoKey key);

    int updateByExampleSelective(@Param("record") IdolDo record, @Param("example") IdolDoExample example);

    int updateByExample(@Param("record") IdolDo record, @Param("example") IdolDoExample example);

    int updateByPrimaryKeySelective(IdolDo record);

    int updateByPrimaryKey(IdolDo record);
}