package com.qtp.xxljobdemo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public void methodA(){
        System.out.println("执行MethodA的方法");
    }
    public void methodB(){
        System.out.println("执行MethodB的方法");
    }
}