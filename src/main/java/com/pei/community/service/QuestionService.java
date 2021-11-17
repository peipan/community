package com.pei.community.service;

import com.pei.community.dto.PaginationDTO;
import com.pei.community.dto.QuestionDTO;
import com.pei.community.exception.CustomizeErrorCode;
import com.pei.community.exception.CustomizeException;
import com.pei.community.mapper.QuestionExtMapper;
import com.pei.community.mapper.QuestionMapper;
import com.pei.community.mapper.UserMapper;
import com.pei.community.model.Question;
import com.pei.community.model.QuestionExample;
import com.pei.community.model.User;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionExtMapper questionExtMapper;



    public PaginationDTO list(Integer page, Integer size) {

        PaginationDTO paginationDTO = new PaginationDTO();
        int totalCount = (int)questionMapper.countByExample(new QuestionExample());
        paginationDTO.setPagination(totalCount, page, size);

        if(page < 1){
            page = 1;
        }
        if(page > paginationDTO.totalPage){
            page = paginationDTO.totalPage;
        }

        Integer offset = size * (page - 1);
        //List<Question> questions = questionMapper.list(offset, size); // 先将question表查询出来，这个表中没有user属性中的avatarUrl（图片地址）
        List<Question> questions = questionMapper.selectByExampleWithRowbounds(new QuestionExample(), new RowBounds(offset, size));
        List<QuestionDTO> questionDTOList = new ArrayList<>(); //封装一个bean（QuestionDTO）,这个类中比Question多个一个User属性，用于接受列表功能所有的属性
        //List<PaginationDTO> paginationDTOList = new ArrayList<>();
        for (Question question : questions) {

            User user = userMapper.selectByPrimaryKey(question.getCreator()); //相当与连表查询，但是逻辑写在了这块，利用Question的creator属性去User表中查询数据
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO); //这个BeanUtils类主要作用就是将question的属性的值完全转移到questionDTO中属性，利用了反射的原理
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);


        }

        paginationDTO.setQuestionDTOList(questionDTOList);



        return paginationDTO;
    }

    public PaginationDTO list(Long userId, Integer page, Integer size) {
        PaginationDTO paginationDTO = new PaginationDTO();
        //int totalCount = questionMapper.totalCountById(userId);
        QuestionExample example = new QuestionExample();
        example.createCriteria()
                .andCreatorEqualTo(userId);
        int totalCount = (int)questionMapper.countByExample(example);
        paginationDTO.setPagination(totalCount, page, size);

        if(page < 1){
            page = 1;
        }
        if(page > paginationDTO.totalPage){
            page = paginationDTO.totalPage;
        }

        Integer offset = size * (page - 1);
        //List<Question> questions = questionMapper.listByUserId(userId, offset, size); // 先将question表查询出来，这个表中没有user属性中的avatarUrl（图片地址）
        QuestionExample example1 = new QuestionExample();
        example1.createCriteria()
                .andCreatorEqualTo(userId);
        List<Question> questions = questionMapper.selectByExampleWithRowbounds(example1, new RowBounds(offset, size));
        List<QuestionDTO> questionDTOList = new ArrayList<>(); //封装一个bean（QuestionDTO）,这个类中比Question多个一个User属性，用于接受列表功能所有的属性
        //List<PaginationDTO> paginationDTOList = new ArrayList<>();
        for (Question question : questions) {

            User user = userMapper.selectByPrimaryKey(question.getCreator()); //相当与连表查询，但是逻辑写在了这块，利用Question的creator属性去User表中查询数据
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO); //这个BeanUtils类主要作用就是将question的属性的值完全转移到questionDTO中属性，利用了反射的原理
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);


        }

        paginationDTO.setQuestionDTOList(questionDTOList);



        return paginationDTO;
    }

    public QuestionDTO getById(Long id) {
        //Question question = questionMapper.getById(id);
        Question question = questionMapper.selectByPrimaryKey(id);
        if(question == null){
            throw new CustomizeException(CustomizeErrorCode.QUESTION_NOT_FOUND);
        }
        QuestionDTO questionDTO = new QuestionDTO();
        User user = userMapper.selectByPrimaryKey(question.getCreator());
        BeanUtils.copyProperties(question, questionDTO);
        questionDTO.setUser(user);
        return questionDTO;
    }

    public void createOrUpdate(Question question) {
        if(question.getId() == null){ //因为这个id是在表单中的，只有回显时，有这个数据才能传过来，而有些弹幕说id本来就是自增长在数据库中，那是没有思考先后顺序的
            //创建
            question.setGtmCreate(System.currentTimeMillis());
            question.setGtmModify(question.getGtmCreate());
            question.setViewCount(0);
            question.setLikeCount(0);
            question.setCommentCount(0);
            questionMapper.insert(question);
        }else{
            //更新
            //question.setGtmModify(question.getGtmCreate());
            Question updateQuestion = new Question();
            updateQuestion.setGtmModify(System.currentTimeMillis());
            updateQuestion.setTitle(question.getTitle());
            updateQuestion.setDescription(question.getDescription());
            updateQuestion.setTag(question.getTag());
            QuestionExample example = new QuestionExample();
            example.createCriteria()
                    .andIdEqualTo(question.getId());
            int update = questionMapper.updateByExampleSelective(updateQuestion, example);
            if(update != 1){
                throw new CustomizeException(CustomizeErrorCode.QUESTION_NOT_FOUND);
            }
        }
    }

    public void incView(Long id) {
        Question question = new Question();
        question.setId(id);
        question.setViewCount(1);
        questionExtMapper.incView(question);
    }
}
