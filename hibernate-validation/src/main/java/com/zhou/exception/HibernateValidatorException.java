package com.zhou.exception;

/**
 * Created by zhouyao on 2018/8/30.
 */
public class HibernateValidatorException extends RuntimeException{

    private static final long serialVersionUID = -3655439959746149646L;
    /**
     * 错误编码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private String message;

    public HibernateValidatorException(String message) {
        super(message);
    }

    public HibernateValidatorException(String errorCode,String message) {
        super(message);
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
