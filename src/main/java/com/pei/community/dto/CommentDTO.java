package com.pei.community.dto;

import lombok.Data;

/**
 * @author peipan
 * created by 2021/11/15 21:12
 */
@Data
public class CommentDTO {
    private long parentId;
    private String content;
    private Integer type;
}
