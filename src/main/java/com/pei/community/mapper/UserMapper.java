package com.pei.community.mapper;

import com.pei.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface UserMapper {
    @Insert("insert into user (name, account_id, token, gtm_create, gtm_modified, avatar_url) values (#{name}, #{accountId}, #{token}, #{gtmCreate}, #{gtmModified}, #{avatarUrl})")
    public void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Integer id);
}
