package com.pei.community.mapper;

import com.pei.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface UserMapper {
    @Insert("insert into user (name, account_id, token, gtm_create, gtm_modified) values (#{name}, #{accountId}, #{token}, #{gtmCreate}, #{gtmModified})")
    public void insert(User user);
}
