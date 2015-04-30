package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectFavorDo;
import com.xjd.ct.dal.dos.ObjectFavorDoExample;
import com.xjd.ct.dal.dos.ObjectFavorDoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectFavorDoMapper {
    int countByExample(ObjectFavorDoExample example);

    int deleteByExample(ObjectFavorDoExample example);

    int deleteByPrimaryKey(ObjectFavorDoKey key);

    int insert(ObjectFavorDo record);

    int insertSelective(ObjectFavorDo record);

    List<ObjectFavorDo> selectByExample(ObjectFavorDoExample example);

    ObjectFavorDo selectByPrimaryKey(ObjectFavorDoKey key);

    int updateByExampleSelective(@Param("record") ObjectFavorDo record, @Param("example") ObjectFavorDoExample example);

    int updateByExample(@Param("record") ObjectFavorDo record, @Param("example") ObjectFavorDoExample example);

    int updateByPrimaryKeySelective(ObjectFavorDo record);

    int updateByPrimaryKey(ObjectFavorDo record);
}