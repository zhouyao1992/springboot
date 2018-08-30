package com.zhou.controller;

import com.zhou.util.ValidateUtil;
import com.zhou.vo.DataVo;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by zhouyao on 2018/8/30.
 */
@RestController
public class ValidationController {


      @RequestMapping("/validation")
      public Object validation(@RequestBody @Valid DataVo vo, BindingResult bindingResult){
          if(bindingResult.hasErrors()){

              for (ObjectError error : bindingResult.getAllErrors()) {
                  System.out.println(error.getDefaultMessage());
              }


          }


          return "success";

      }




    @RequestMapping("/validation2")
    public Object validation(@RequestBody DataVo vo) throws Exception{

        ValidateUtil.validate(vo);
        return "success";

    }

}
