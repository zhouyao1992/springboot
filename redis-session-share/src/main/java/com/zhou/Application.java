package com.zhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by zhouyao on 2018/8/29.
 */
@Configuration
/**
 * 客户端session交由spring-session处理并且存储到redis中
 * maxInactiveIntervalInSeconds session失效时间
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds=60)
@SpringBootApplication
public class Application {


    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }


}
