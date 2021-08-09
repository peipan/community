package com.pei.community.model;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gtmCreate;
    private Long gtmModified;
    private String avatarUrl;
}
