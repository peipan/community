package com.pei.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"你找的问题不在了，要不换一个试试？"),
    COMMENT_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复"),
    NO_LOGIN(2003, "当前操作需要登录，请先登录"),
    SYS_ERROR(2004, "服务器冒烟了，要不然稍后再试试！！！"),
    TYPE_PARAM_WRONG(2005, "评论类型错误！！！"),
    COMMENT_NOT_FOUND(2006, "回复评论没有找到！");

    private Integer code;
    private String message;

    @Override
    public String getMessage(){
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
