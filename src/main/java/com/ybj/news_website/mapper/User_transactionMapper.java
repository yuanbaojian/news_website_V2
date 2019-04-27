package com.ybj.news_website.Mapper;

import com.ybj.news_website.model.User_transaction;
import com.ybj.news_website.model.User_transactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User_transactionMapper {
    long countByExample(User_transactionExample example);

    int deleteByExample(User_transactionExample example);

    int insert(User_transaction record);

    int insertSelective(User_transaction record);

    List<User_transaction> selectByExample(User_transactionExample example);

    int updateByExampleSelective(@Param("record") User_transaction record, @Param("example") User_transactionExample example);

    int updateByExample(@Param("record") User_transaction record, @Param("example") User_transactionExample example);
}