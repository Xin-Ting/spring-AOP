package org.example;

import org.example.config.AopConfig;
import org.example.service.JavaService;
import org.example.service.PythonService;
import org.example.service.impl.JavaServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author 85217
 */

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        JavaServiceImpl javaService = applicationContext.getBean(JavaServiceImpl.class);
        PythonService pythonService = applicationContext.getBean(PythonService.class);
        //推荐使用接口的字节码，因为接口的是jdk代理，效率会更高
        javaService.studyJava();
        pythonService.studyPython();

    }


}
