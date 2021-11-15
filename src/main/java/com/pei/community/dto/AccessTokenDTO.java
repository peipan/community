package com.pei.community.dto;

import lombok.Data;

@Data
public class AccessTokenDTO {
    private String client_id;//github应用创建就会自动在页面中给出，下面也是
    private String client_secret;
    private String code;//2.2、操作C：github会根据回调地址 在后面带上一个用户授权码code 比如：localhost:8887/callback?code=cf05e461199ffdaa4ee6
    private String state;//目前不知道具体作用 可有可无
}
