package com.xxm.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xxm.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Program: IntelliJ IDEA dubbo_demo_provider
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-21 19:06:09 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("[服务提供者]：HelloServiceImpl中提供的sayHello方法,传递的参数是"+name);
        return "hello"+name;
    }
}
