package com.qxnw.dubbo.consumer.controller;

import com.qxnw.dubbot.provide.api.ProvideApi;
import com.qxnw.dubbot.provide.dto.User;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConsumerController
 *
 * @author yanwenjie
 * @date 2022/11/29 15:34
 */
@RestController
public class ConsumerController {

    @DubboReference(version = "1.0")
    private ProvideApi helloApi;

    @GetMapping("/hello")
    public String sayHello() {
        return helloApi.sayHello();
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable("id") Long id) {
        User kun = helloApi.getUser(id, "蔡徐坤");
        return kun.toString();
    }
}
