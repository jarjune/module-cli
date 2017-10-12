package com.jarjune.controller;

import com.jarjune.service.IndexService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/dubbo-consumer.xml");
        context.start();
        IndexService demoService = (IndexService)context.getBean("demoService"); // 获取远程服务代理
        Map hello = demoService.getMap(); // 执行远程方法
        System.out.println(hello);
    }
}