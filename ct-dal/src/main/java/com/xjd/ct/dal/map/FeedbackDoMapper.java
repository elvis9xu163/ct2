package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.FeedbackDo;
import com.xjd.ct.dal.dos.FeedbackDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedbackDoMapper {
    int countByExample(FeedbackDoExample example);

    int deleteByExample(FeedbackDoExample example);

    int deleteByPrimaryKey(Long feedbackId);

    int insert(FeedbackDo record);

    int insertSelective(FeedbackDo record);

    List<FeedbackDo> selectByExample(FeedbackDoExample example);

    FeedbackDo selectByPrimaryKey(Long feedbackId);

    int updateByExampleSelective(@Param("record") FeedbackDo record, @Param("example") FeedbackDoExample example);

    int updateByExample(@Param("record") FeedbackDo record, @Param("example") FeedbackDoExample example);

    int updateByPrimaryKeySelective(FeedbackDo record);

    int updateByPrimaryKey(FeedbackDo record);
}