package com.ybj.news_website.Mapper;

import com.ybj.news_website.model.Fan;
import com.ybj.news_website.model.FanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FanMapper {
    long countByExample(FanExample example);

    int deleteByExample(FanExample example);

    int insert(Fan record);

    int insertSelective(Fan record);

    List<Fan> selectByExample(FanExample example);

    int updateByExampleSelective(@Param("record") Fan record, @Param("example") FanExample example);

    int updateByExample(@Param("record") Fan record, @Param("example") FanExample example);
}