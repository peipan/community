package com.pei.community.advice;

import com.alibaba.fastjson.JSON;
import com.pei.community.dto.ResultDTO;
import com.pei.community.exception.CustomizeErrorCode;
import com.pei.community.exception.CustomizeException;
import com.sun.deploy.net.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@ControllerAdvice
public class CustomizeExceptionHandler {

    //要想返回json格式，需要加@ResponceBody注解，但是加了注解之后返回ModelAndView就不能用
    //所以采用javaWeb最原生的方法
    //PrintWriter writer = response.getWriter();
    //writer.write(JSON.toJSONString(resultDTO));
    //@ResponceBody
    @ExceptionHandler(Exception.class)
    ModelAndView handle(Throwable e,
                        Model model,
                        HttpServletRequest request,
                        HttpServletResponse response){
        String contentType = request.getContentType();
        ResultDTO resultDTO;
        if("application/json".equals(contentType)){
            //返回json
            if(e instanceof CustomizeException){
                resultDTO = ResultDTO.errorOf((CustomizeException)e);
            }else{
                resultDTO = ResultDTO.errorOf(CustomizeErrorCode.SYS_ERROR);
            }

            try {
                response.setCharacterEncoding("utf-8");
                response.setContentType("application/json");
                response.setStatus(200);
                PrintWriter writer = response.getWriter();
                writer.write(JSON.toJSONString(resultDTO));
                writer.close();
            } catch (IOException ioException) {
            }
            return null;

        }else {
            //错误页面跳转
            if (e instanceof CustomizeException) {
                model.addAttribute("message", e.getMessage());
            } else {
                model.addAttribute("message", CustomizeErrorCode.SYS_ERROR.getMessage());
            }
            return new ModelAndView("error");
        }
    }
}
