package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ReportDo;
import com.xjd.ct.dal.dos.ReportDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportDoMapper {
    int countByExample(ReportDoExample example);

    int deleteByExample(ReportDoExample example);

    int deleteByPrimaryKey(Long reportId);

    int insert(ReportDo record);

    int insertSelective(ReportDo record);

    List<ReportDo> selectByExample(ReportDoExample example);

    ReportDo selectByPrimaryKey(Long reportId);

    int updateByExampleSelective(@Param("record") ReportDo record, @Param("example") ReportDoExample example);

    int updateByExample(@Param("record") ReportDo record, @Param("example") ReportDoExample example);

    int updateByPrimaryKeySelective(ReportDo record);

    int updateByPrimaryKey(ReportDo record);
}