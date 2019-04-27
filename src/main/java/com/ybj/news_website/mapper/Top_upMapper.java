package com.ybj.news_website.Mapper;

import com.ybj.news_website.model.Top_up;
import com.ybj.news_website.model.Top_upExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Top_upMapper {
    long countByExample(Top_upExample example);

    int deleteByExample(Top_upExample example);

    int deleteByPrimaryKey(Integer top_up_id);

    int insert(Top_up record);

    int insertSelective(Top_up record);

    List<Top_up> selectByExample(Top_upExample example);

    Top_up selectByPrimaryKey(Integer top_up_id);

    int updateByExampleSelective(@Param("record") Top_up record, @Param("example") Top_upExample example);

    int updateByExample(@Param("record") Top_up record, @Param("example") Top_upExample example);

    int updateByPrimaryKeySelective(Top_up record);

    int updateByPrimaryKey(Top_up record);
}