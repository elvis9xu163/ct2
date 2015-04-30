package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.BannerDo;
import com.xjd.ct.dal.dos.BannerDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerDoMapper {
    int countByExample(BannerDoExample example);

    int deleteByExample(BannerDoExample example);

    int deleteByPrimaryKey(Long bannerId);

    int insert(BannerDo record);

    int insertSelective(BannerDo record);

    List<BannerDo> selectByExample(BannerDoExample example);

    BannerDo selectByPrimaryKey(Long bannerId);

    int updateByExampleSelective(@Param("record") BannerDo record, @Param("example") BannerDoExample example);

    int updateByExample(@Param("record") BannerDo record, @Param("example") BannerDoExample example);

    int updateByPrimaryKeySelective(BannerDo record);

    int updateByPrimaryKey(BannerDo record);
}