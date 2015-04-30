package com.xjd.ct.dal.map;

import com.xjd.ct.dal.dos.TokenDo;
import com.xjd.ct.dal.dos.TokenDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TokenDoMapper {
    int countByExample(TokenDoExample example);

    int deleteByExample(TokenDoExample example);

    int deleteByPrimaryKey(String token);

    int insert(TokenDo record);

    int insertSelective(TokenDo record);

    List<TokenDo> selectByExample(TokenDoExample example);

    TokenDo selectByPrimaryKey(String token);

    int updateByExampleSelective(@Param("record") TokenDo record, @Param("example") TokenDoExample example);

    int updateByExample(@Param("record") TokenDo record, @Param("example") TokenDoExample example);

    int updateByPrimaryKeySelective(TokenDo record);

    int updateByPrimaryKey(TokenDo record);
}