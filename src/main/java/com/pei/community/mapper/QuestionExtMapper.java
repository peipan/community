package com.pei.community.mapper;

import com.pei.community.model.Question;
import com.pei.community.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 自定义的QuestionMapper方法，也就是如果mybatis-generation没有自动生成一种与数据库交互的方法
 * 则自己自定义一个
 */
public interface QuestionExtMapper {

    int incView(@Param("record") Question record);

    int incCommentCount(@Param("record") Question record);

}