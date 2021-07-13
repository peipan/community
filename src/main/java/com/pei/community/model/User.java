package com.pei.community.model;

public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gtmCreate;
    private Long gtmModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getGtmCreate() {
        return gtmCreate;
    }

    public void setGtmCreate(Long gtmCreate) {
        this.gtmCreate = gtmCreate;
    }

    public Long getGtmModified() {
        return gtmModified;
    }

    public void setGtmModified(Long gtmModified) {
        this.gtmModified = gtmModified;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountId='" + accountId + '\'' +
                ", token='" + token + '\'' +
                ", gtmCreate=" + gtmCreate +
                ", gtmModified=" + gtmModified +
                '}';
    }
}
