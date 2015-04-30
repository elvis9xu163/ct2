package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectCommentDo;
import com.xjd.ct.dal.dos.ObjectCommentDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectCommentDoMapper {
    int countByExample(ObjectCommentDoExample example);

    int deleteByExample(ObjectCommentDoExample example);

    int deleteByPrimaryKey(Long commentId);

    int insert(ObjectCommentDo record);

    int insertSelective(ObjectCommentDo record);

    List<ObjectCommentDo> selectByExample(ObjectCommentDoExample example);

    ObjectCommentDo selectByPrimaryKey(Long commentId);

    int updateByExampleSelective(@Param("record") ObjectCommentDo record, @Param("example") ObjectCommentDoExample example);

    int updateByExample(@Param("record") ObjectCommentDo record, @Param("example") ObjectCommentDoExample example);

    int updateByPrimaryKeySelective(ObjectCommentDo record);

    int updateByPrimaryKey(ObjectCommentDo record);
}