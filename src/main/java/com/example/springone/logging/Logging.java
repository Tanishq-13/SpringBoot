package com.example.springone.logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

    @Before("execution(public void com.example.springone.service.UserServic.login())")
    public void loggingAdvice1(){
        System.out.println("loggingAdvice1");
    }

    @After("execution(public void com.example.springone.service.UserServic.login())")
    public void loggingAdvice2(){
        System.out.println("loggingAdvice2");
    }

}
