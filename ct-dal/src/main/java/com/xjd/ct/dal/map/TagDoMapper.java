package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.TagDo;
import com.xjd.ct.dal.dos.TagDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagDoMapper {
    int countByExample(TagDoExample example);

    int deleteByExample(TagDoExample example);

    int deleteByPrimaryKey(Long tagId);

    int insert(TagDo record);

    int insertSelective(TagDo record);

    List<TagDo> selectByExample(TagDoExample example);

    TagDo selectByPrimaryKey(Long tagId);

    int updateByExampleSelective(@Param("record") TagDo record, @Param("example") TagDoExample example);

    int updateByExample(@Param("record") TagDo record, @Param("example") TagDoExample example);

    int updateByPrimaryKeySelective(TagDo record);

    int updateByPrimaryKey(TagDo record);
}