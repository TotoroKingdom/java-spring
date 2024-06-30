package org.springframework.test.beans.factory;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description:
 */

public class HelloService {

    public String sayHello(){
        System.out.println("hello");
        return "hello";
    }
}
