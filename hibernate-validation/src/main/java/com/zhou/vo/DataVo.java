package com.zhou.vo;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by zhouyao on 2018/8/30.
 */
public class DataVo implements Serializable{

    private static final long serialVersionUID = -329231741332115460L;

    @NotNull(message="id标识不能为空")
    public Long id;

    @NotBlank(message="姓名不能为空")
    @Size(min = 6, max = 8 , message="姓名长度为[6,8】")
    public String name;

    @NotNull(message="年龄不能为空")
    public int age;

    @Length(max = 11, min = 11, message = "手机号的长度必须是11位.")
    @Pattern(regexp="^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$", message="手机号格式不正确")
    public String phone;

    @NotBlank(message="邮箱不能为空")
    @Email(message="邮箱格式错误")
    public String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
