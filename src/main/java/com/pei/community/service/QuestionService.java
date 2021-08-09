package com.pei.community.service;

import com.pei.community.dto.QuestionDTO;
import com.pei.community.mapper.QuestionMapper;
import com.pei.community.mapper.UserMapper;
import com.pei.community.model.Question;
import com.pei.community.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    public List<QuestionDTO> list() {
        List<Question> questions = questionMapper.list(); // 先将question表查询出来，这个表中没有user属性中的avatarUrl（图片地址）
        List<QuestionDTO> questionDTOList = new ArrayList<>(); //封装一个bean（QuestionDTO）,这个类中比Question多个一个User属性，用于接受列表功能所有的属性
        for (Question question : questions) {
            User user = userMapper.findById(question.getCreator()); //相当与连表查询，但是逻辑写在了这块，利用Question的creator属性去User表中查询数据
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO); //这个BeanUtils类主要作用就是将question的属性的值完全转移到questionDTO中属性，利用了反射的原理
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        return questionDTOList;
    }
}
