package org.example.service.impl;

import org.aspectj.lang.annotation.Pointcut;
import org.example.service.JavaService;
import org.springframework.stereotype.Service;

/**
 * @author 85217
 */
@Service
public class JavaServiceImpl implements JavaService {

    public void studyJava() {
        System.out.println("学习Java......");

    }


}
