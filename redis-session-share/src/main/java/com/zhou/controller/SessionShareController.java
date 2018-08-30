package com.zhou.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhouyao on 2018/8/29.
 */
@RestController
@RequestMapping(value = "/home")
public class SessionShareController {
    @Value("${server.port}")
    private String port;


    @RequestMapping(value = "/req", method = RequestMethod.GET)
    public Map<String, Object> req (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        HttpSession session = request.getSession();
        map.put("requestUrl:", request.getRequestURL());
        map.put("sessionId:",session.getId());
        return map;
    }

    @RequestMapping(value = "/getSession", method = RequestMethod.GET)
    public Object getSession (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        try {
            map.put("sessionId:", request.getSession().getId());
            map.put("ipAddress:", InetAddress.getLocalHost().getHostAddress() + ":" + port);
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }
}
