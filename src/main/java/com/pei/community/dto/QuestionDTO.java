package com.pei.community.dto;

import com.pei.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gtmCreate;
    private Long gtmModified;
    private Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;  //DTO 表示传输层，也就是为了解决model层中数据库中的类型数据（属性）已经定型的情况下，加入另一个属性的作用
}
