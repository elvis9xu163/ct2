package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.ObjectLikeDo;
import com.xjd.ct.dal.dos.ObjectLikeDoExample;
import com.xjd.ct.dal.dos.ObjectLikeDoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectLikeDoMapper {
    int countByExample(ObjectLikeDoExample example);

    int deleteByExample(ObjectLikeDoExample example);

    int deleteByPrimaryKey(ObjectLikeDoKey key);

    int insert(ObjectLikeDo record);

    int insertSelective(ObjectLikeDo record);

    List<ObjectLikeDo> selectByExample(ObjectLikeDoExample example);

    ObjectLikeDo selectByPrimaryKey(ObjectLikeDoKey key);

    int updateByExampleSelective(@Param("record") ObjectLikeDo record, @Param("example") ObjectLikeDoExample example);

    int updateByExample(@Param("record") ObjectLikeDo record, @Param("example") ObjectLikeDoExample example);

    int updateByPrimaryKeySelective(ObjectLikeDo record);

    int updateByPrimaryKey(ObjectLikeDo record);
}