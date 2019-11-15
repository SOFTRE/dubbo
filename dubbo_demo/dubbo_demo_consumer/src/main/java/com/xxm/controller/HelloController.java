package com.xxm.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xxm.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Program: IntelliJ IDEA dubbo_demo_consumer
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-21 19:55:41 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Controller
@ResponseBody
@RequestMapping("/hello")
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        System.out.println("[服务提供者]：HelloServiceImpl中提供的sayHello方法,传递的参数是" + name);
        String hello = helloService.sayHello(name);
        return hello;
    }
}
