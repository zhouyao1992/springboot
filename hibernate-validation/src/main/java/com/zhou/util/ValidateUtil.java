package com.zhou.util;

import com.zhou.exception.HibernateValidatorException;
import com.zhou.vo.DataVo;
import org.hibernate.validator.HibernateValidator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by zhouyao on 2018/8/30.
 */
public class ValidateUtil {

    /**
     * 使用hibernate的注解来进行验证
     *
     */
    private static Validator validator = Validation.byProvider(HibernateValidator.class).configure().failFast(true).buildValidatorFactory().getValidator();


    public static <T> void validate(T obj){

        Set<ConstraintViolation<T>> constraintViolations = validator.validate(obj);
        //抛出检验异常
        Iterator<ConstraintViolation<T>> iter = constraintViolations.iterator();
        StringBuffer buffer = new StringBuffer();
        while (iter.hasNext()) {
            ConstraintViolation<T> error = iter.next();

            buffer.append("[").append(error.getPropertyPath().toString()).append("]")
                    .append(error.getMessage());

        }
       System.out.print(buffer.toString());
    }


    public static void main(String[] args) throws Exception{

        DataVo vo = new DataVo();
        vo.setId(11111111L);
        vo.setName("哈哈哈哈哈哈哈");
        vo.setEmail("412729287@qq.com");
        vo.setAge(21);
        vo.setPhone("15972392222");
        ValidateUtil.validate(vo);
    }


}
