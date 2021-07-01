package com.pei.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by peipan on 2021/7/1
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
