package com.pei.community.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.account_id
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.NAME
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.token
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gtm_create
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    private Long gtmCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gtm_modified
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    private Long gtmModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.bio
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    private String bio;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.avatar_url
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    private String avatarUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.account_id
     *
     * @return the value of user.account_id
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.account_id
     *
     * @param accountId the value for user.account_id
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.NAME
     *
     * @return the value of user.NAME
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.NAME
     *
     * @param name the value for user.NAME
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.token
     *
     * @return the value of user.token
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.token
     *
     * @param token the value for user.token
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gtm_create
     *
     * @return the value of user.gtm_create
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public Long getGtmCreate() {
        return gtmCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gtm_create
     *
     * @param gtmCreate the value for user.gtm_create
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public void setGtmCreate(Long gtmCreate) {
        this.gtmCreate = gtmCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gtm_modified
     *
     * @return the value of user.gtm_modified
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public Long getGtmModified() {
        return gtmModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gtm_modified
     *
     * @param gtmModified the value for user.gtm_modified
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public void setGtmModified(Long gtmModified) {
        this.gtmModified = gtmModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.bio
     *
     * @return the value of user.bio
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public String getBio() {
        return bio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.bio
     *
     * @param bio the value for user.bio
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.avatar_url
     *
     * @return the value of user.avatar_url
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.avatar_url
     *
     * @param avatarUrl the value for user.avatar_url
     *
     * @mbg.generated Thu Oct 28 00:55:35 CST 2021
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}