package com.pei.community.mapper;

import com.pei.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface QuestionMapper {

    @Insert("insert into question (title, description, gtm_create, gtm_modify, creator, tag) values (#{title}, #{description}, #{gtmCreate}, #{gtmModified}, #{creator}, #{tag})")
    void create(Question question);

    @Select("select * from question limit #{offset}, #{page}")
    List<Question> list(@Param(value = "offset") Integer offset, @Param(value = "page") Integer page); //形参为非对像，需要自己做一下映射

    @Select("select count(1) from question")
    int totalCount();
}
