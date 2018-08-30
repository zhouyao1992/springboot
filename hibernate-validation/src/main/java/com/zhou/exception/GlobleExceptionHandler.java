/*package com.zhou.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;*/


/**
 * Created by zhouyao on 2018/8/30.
 */
/*
@Component
public class GlobleExceptionHandler implements HandlerExceptionResolver {
    private Logger logger = LoggerFactory.getLogger(GlobleExceptionHandler.class);


    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
        if (ex instanceof HibernateValidatorException) {
            logger.info("GlobleExceptionHandler catch exception : InvalidParamException");
            ModelAndView mv = new ModelAndView();
            */
/* 使用response返回 *//*

            response.setStatus(HttpStatus.OK.value()); // 设置状态码
            response.setContentType(MediaType.APPLICATION_JSON_VALUE); // 设置ContentType
            response.setCharacterEncoding("UTF-8"); // 避免乱码
            try {
                response.getWriter().write("你想返回的JSON字符串");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return mv;
        }
        return null;
    }

}*/
