package com.pei.community.controller;

import com.pei.community.dto.AccessTokenDTO;
import com.pei.community.dto.GithubUser;
import com.pei.community.mapper.UserMapper;
import com.pei.community.model.User;
import com.pei.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * Created by peipan on 2021/7/2
 */
@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;

    @Value("${github.client.id}")
    private String clientId;
    @Value("${github.client.secret}")
    private String clientSecret;

    @Autowired
    private UserMapper userMapper;


    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           HttpServletResponse response){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id(clientId);
        accessTokenDTO.setClient_secret(clientSecret);
        accessTokenDTO.setCode(code);
        //accessTokenDTO.setRedirect_uri("http://localhost:8887/callback");

        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser githubUser = githubProvider.getUser(accessToken);

        if(githubUser != null){
            User user = new User();
            String token = UUID.randomUUID().toString();
            user.setToken(token);
            user.setName(githubUser.getName());
            user.setAccountId(String.valueOf(githubUser.getId()));
            user.setGtmCreate(System.currentTimeMillis());
            user.setGtmModified(user.getGtmCreate());

            userMapper.insert(user);
            response.addCookie(new Cookie("token", token));

            //登陆成功，写cookie和session
            //request.getSession().setAttribute("githubUser", user);
            return "redirect:/";
        }else{
            //登陆失败，重新登陆
            return "redirect:/";
        }




    }
}
