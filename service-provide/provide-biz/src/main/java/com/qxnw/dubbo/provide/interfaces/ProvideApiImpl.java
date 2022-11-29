package com.qxnw.dubbo.provide.interfaces;

import com.qxnw.dubbot.provide.api.ProvideApi;
import com.qxnw.dubbot.provide.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * UserApiImpl
 *
 * @author yanwenjie
 * @date 2022/11/28 17:10
 */
@Slf4j
@DubboService(version = "1.0")
public class ProvideApiImpl implements ProvideApi {

    @Override
    public String sayHello() {
        log.info("[provide] required say hello");
        return "provide say hello";
    }

    @Override
    public User getUser(Long id, String name) {
        return new User(id, name);
    }

}
