package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.UserBindAccountDo;
import com.xjd.ct.dal.dos.UserBindAccountDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBindAccountDoMapper {
    int countByExample(UserBindAccountDoExample example);

    int deleteByExample(UserBindAccountDoExample example);

    int deleteByPrimaryKey(Long accountId);

    int insert(UserBindAccountDo record);

    int insertSelective(UserBindAccountDo record);

    List<UserBindAccountDo> selectByExample(UserBindAccountDoExample example);

    UserBindAccountDo selectByPrimaryKey(Long accountId);

    int updateByExampleSelective(@Param("record") UserBindAccountDo record, @Param("example") UserBindAccountDoExample example);

    int updateByExample(@Param("record") UserBindAccountDo record, @Param("example") UserBindAccountDoExample example);

    int updateByPrimaryKeySelective(UserBindAccountDo record);

    int updateByPrimaryKey(UserBindAccountDo record);
}