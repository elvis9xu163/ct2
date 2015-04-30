package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectCommentLikeDo;
import com.xjd.ct.dal.dos.ObjectCommentLikeDoExample;
import com.xjd.ct.dal.dos.ObjectCommentLikeDoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectCommentLikeDoMapper {
    int countByExample(ObjectCommentLikeDoExample example);

    int deleteByExample(ObjectCommentLikeDoExample example);

    int deleteByPrimaryKey(ObjectCommentLikeDoKey key);

    int insert(ObjectCommentLikeDo record);

    int insertSelective(ObjectCommentLikeDo record);

    List<ObjectCommentLikeDo> selectByExample(ObjectCommentLikeDoExample example);

    ObjectCommentLikeDo selectByPrimaryKey(ObjectCommentLikeDoKey key);

    int updateByExampleSelective(@Param("record") ObjectCommentLikeDo record, @Param("example") ObjectCommentLikeDoExample example);

    int updateByExample(@Param("record") ObjectCommentLikeDo record, @Param("example") ObjectCommentLikeDoExample example);

    int updateByPrimaryKeySelective(ObjectCommentLikeDo record);

    int updateByPrimaryKey(ObjectCommentLikeDo record);
}