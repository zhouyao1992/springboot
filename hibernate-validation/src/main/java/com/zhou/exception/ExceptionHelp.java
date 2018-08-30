package com.zhou.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常 捕捉
 * Created by zhouyao on 2018/8/30.
 */

@ControllerAdvice
public class ExceptionHelp {

    private Logger logger = LoggerFactory.getLogger(ExceptionHelp.class);


    //异常父类
    @ExceptionHandler({HibernateValidatorException.class})
    @ResponseBody
    public Object runTimeException(HttpServletRequest request, HibernateValidatorException e) {
        String uri = request.getRequestURI();
        logger.error("[" + uri + "]捕获HibernateValidator校验异常{}", e.getMessage(), e);
        return e.getMessage();
    }

    //异常父类
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public Object runTimeException(HttpServletRequest request, Exception e) {
        String uri = request.getRequestURI();
        logger.error("[" + uri + "]捕获系统级别非法异常{}", e.getMessage(), e);
        return "系统级别异常";
    }




}