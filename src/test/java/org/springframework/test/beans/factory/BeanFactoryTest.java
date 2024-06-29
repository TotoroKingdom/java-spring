package org.springframework.test.beans.factory;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import static org.assertj.core.api.Assertions.assertThat;


/**
 * @Author: totoro
 * @CreateTime: 2024-06-29
 * @Description:
 */

public class BeanFactoryTest{

    @Test
    public void testGetBean(){

        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());

        HelloService helloService = (HelloService) beanFactory.getBean("helloService");

        assertThat(helloService).isNotNull();
        assertThat(helloService.sayHello()).isEqualTo("hello");

    }

    class HelloService{

        public String sayHello(){
            System.out.println("hello");
            return "hello";
        }
    }

}