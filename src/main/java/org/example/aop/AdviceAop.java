package org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author 85217
 */

@Aspect
@Component
public class AdviceAop {

    @Pointcut(value = "execution(* study*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("打基础......");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) {

        Object proceed = null;
        try {
            proceed = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("敲代码......");

    }
}
