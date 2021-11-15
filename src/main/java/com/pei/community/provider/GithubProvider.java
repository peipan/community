package com.pei.community.provider;

import com.alibaba.fastjson.JSON;
import com.pei.community.dto.AccessTokenDTO;
import com.pei.community.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by peipan on 2021/7/2
 */
@Component
public class GithubProvider {
    //以下是okhttp的代码进行post或者get请求，就不用去html页面进行post和get请求了
    public String getAccessToken(AccessTokenDTO accessTokenDTO){
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");

        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO)); //JSON.toJSONString(accessTokenDTO)  使用的是fastjson依赖！
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            String token = string.split("&")[0].split("=")[1];
            System.out.println(token);
            return token;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public GithubUser getUser(String accessToken){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/user")
                .header("Authorization", "token " + accessToken) //token右边少一个空格，找半天错误
                .build();
        try {
            Response response = client.newCall(request).execute();
            String string = response.body().string();
            System.out.println(string);
            GithubUser githubUser = JSON.parseObject(string, GithubUser.class); //json的对象自动解析成GithubUser对象
            return githubUser;
        } catch (IOException e) {

        }
        return null;
    }
}
