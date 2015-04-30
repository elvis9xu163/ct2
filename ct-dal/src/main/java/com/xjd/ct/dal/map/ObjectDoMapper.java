package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectDo;
import com.xjd.ct.dal.dos.ObjectDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectDoMapper {
    int countByExample(ObjectDoExample example);

    int deleteByExample(ObjectDoExample example);

    int deleteByPrimaryKey(Long objectId);

    int insert(ObjectDo record);

    int insertSelective(ObjectDo record);

    List<ObjectDo> selectByExample(ObjectDoExample example);

    ObjectDo selectByPrimaryKey(Long objectId);

    int updateByExampleSelective(@Param("record") ObjectDo record, @Param("example") ObjectDoExample example);

    int updateByExample(@Param("record") ObjectDo record, @Param("example") ObjectDoExample example);

    int updateByPrimaryKeySelective(ObjectDo record);

    int updateByPrimaryKey(ObjectDo record);
}