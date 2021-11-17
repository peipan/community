package com.pei.community.enums;

/**
 * @author peipan
 * created by 2021/11/16 19:37
 */

/**
 * CommentTypeEnum: 评论类型的枚举类
 */
public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);
    private Integer type;

    public Integer getType() {
        return type;
    }

    CommentTypeEnum(Integer type) {
        this.type = type;
    }

    public static boolean isExist(Integer type) {
        for (CommentTypeEnum value : CommentTypeEnum.values()) {
            if(value.getType() == type){
                return true;
            }
        }
        return false;
    }
}
