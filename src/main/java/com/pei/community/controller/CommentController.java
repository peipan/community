package com.pei.community.controller;

import com.pei.community.dto.CommentDTO;
import com.pei.community.dto.ResultDTO;
import com.pei.community.exception.CustomizeErrorCode;
import com.pei.community.mapper.CommentMapper;
import com.pei.community.model.Comment;
import com.pei.community.model.User;
import com.pei.community.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.time.temporal.ValueRange;
import java.util.HashMap;
import java.util.Map;

/**
 * @author peipan
 * created by 2021/11/15 21:06
 */
@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @ResponseBody //自动讲一个对象序列化成json
    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public Object post(@RequestBody CommentDTO commentDTO,
                       HttpServletRequest request){ //RequestBody自动将json序列化一个对象
        User user = (User)request.getSession().getAttribute("user");
        if(user == null){
            return ResultDTO.errorOf(CustomizeErrorCode.NO_LOGIN);
        }
        Comment comment = new Comment();
        comment.setParentId(commentDTO.getParentId());
        comment.setContent(commentDTO.getContent());
        comment.setType(commentDTO.getType());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setCommentator(user.getId());
        comment.setLikeCount(0l);
        commentService.insert(comment);

        return ResultDTO.okOf();
    }
}
