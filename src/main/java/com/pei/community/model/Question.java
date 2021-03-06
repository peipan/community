package com.pei.community.model;

public class Question {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.id
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.title
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.description
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.gtm_create
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    private Long gtmCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.gtm_modify
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    private Long gtmModify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.comment_count
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    private Integer commentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.creator
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    private Long creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.view_count
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    private Integer viewCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.like_count
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    private Integer likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.tag
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    private String tag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.id
     *
     * @return the value of question.id
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.id
     *
     * @param id the value for question.id
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.title
     *
     * @return the value of question.title
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.title
     *
     * @param title the value for question.title
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.description
     *
     * @return the value of question.description
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.description
     *
     * @param description the value for question.description
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.gtm_create
     *
     * @return the value of question.gtm_create
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public Long getGtmCreate() {
        return gtmCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.gtm_create
     *
     * @param gtmCreate the value for question.gtm_create
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public void setGtmCreate(Long gtmCreate) {
        this.gtmCreate = gtmCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.gtm_modify
     *
     * @return the value of question.gtm_modify
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public Long getGtmModify() {
        return gtmModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.gtm_modify
     *
     * @param gtmModify the value for question.gtm_modify
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public void setGtmModify(Long gtmModify) {
        this.gtmModify = gtmModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.comment_count
     *
     * @return the value of question.comment_count
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.comment_count
     *
     * @param commentCount the value for question.comment_count
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.creator
     *
     * @return the value of question.creator
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public Long getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.creator
     *
     * @param creator the value for question.creator
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.view_count
     *
     * @return the value of question.view_count
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.view_count
     *
     * @param viewCount the value for question.view_count
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.like_count
     *
     * @return the value of question.like_count
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.like_count
     *
     * @param likeCount the value for question.like_count
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.tag
     *
     * @return the value of question.tag
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.tag
     *
     * @param tag the value for question.tag
     *
     * @mbg.generated Wed Nov 17 20:07:40 CST 2021
     */
    public void setTag(String tag) {
        this.tag = tag;
    }
}