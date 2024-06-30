package org.springframework.test.beans.factory;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @Author: totoro
 * @CreateTime: 2024-06-29
 * @Description:
 */

public class BeanFactoryTest{


    @Test
    public void testBeanFactory(){

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService",beanDefinition);

        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();


    }
//    @Test
//    public void testBeanFactory(){
//
//        BeanFactory beanFactory = new BeanFactory();
//        beanFactory.registerBean("helloService", new HelloService());
//
//        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
//
//        assertThat(helloService).isNotNull();
//        assertThat(helloService.sayHello()).isEqualTo("hello");
//
//    }


}