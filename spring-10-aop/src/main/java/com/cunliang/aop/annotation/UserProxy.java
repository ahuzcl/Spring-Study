package com.cunliang.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect //生成代理对象
public class UserProxy {

    //前置通知
    @Before(value = "execution(* com.cunliang.aop.annotation.User.add(..))")
    public void before(){
        System.out.println("before...");
    }

    @After(value = "execution(* com.cunliang.aop.annotation.User.add(..))")
    public void after(){
        System.out.println("after...");
    }

    /**
     * 异常通知
     */
    @AfterThrowing(value = "execution(* com.cunliang.aop.annotation.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    /**
     * 环绕通知：在方法之前之后都执行
     */
    @Around(value = "execution(* com.cunliang.aop.annotation.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后");
    }

    @AfterReturning(value = "execution(* com.cunliang.aop.annotation.User.add(..))")
    public void afterReturning(){
        System.out.println("After Returning ");
    }

}
