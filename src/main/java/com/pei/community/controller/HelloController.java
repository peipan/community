package com.pei.community.controller;

import com.pei.community.dto.PaginationDTO;
import com.pei.community.dto.QuestionDTO;
import com.pei.community.mapper.QuestionMapper;
import com.pei.community.mapper.UserMapper;
import com.pei.community.model.Question;
import com.pei.community.model.User;
import com.pei.community.service.QuestionService;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by peipan on 2021/7/1
 */
@Controller
public class HelloController {


    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "2") Integer size
                        ){

        PaginationDTO paginationDTO = questionService.list(page, size);

        model.addAttribute("pagination", paginationDTO);
        return "index";
    }
}
