package com.ybj.news_website.Mapper;

import com.ybj.news_website.model.Balance;
import com.ybj.news_website.model.BalanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalanceMapper {
    long countByExample(BalanceExample example);

    int deleteByExample(BalanceExample example);

    int insert(Balance record);

    int insertSelective(Balance record);

    List<Balance> selectByExample(BalanceExample example);

    int updateByExampleSelective(@Param("record") Balance record, @Param("example") BalanceExample example);

    int updateByExample(@Param("record") Balance record, @Param("example") BalanceExample example);
}