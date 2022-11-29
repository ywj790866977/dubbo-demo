package com.qxnw.dubbot.provide.api;

import com.qxnw.dubbot.provide.dto.User;

/**
 * HelloApi
 *
 * @author yanwenjie
 * @date 2022/11/28 16:58
 */
public interface ProvideApi {

    /**
     * hello
     *
     * @return
     */
    String sayHello();

    /**
     * 获取用户信息
     *
     * @param id   id
     * @param name 名称
     * @return 实体信息
     */
    User getUser(Long id, String name);
}
