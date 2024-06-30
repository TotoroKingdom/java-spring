package org.springframework.test.factory;

import org.junit.Test;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.test.bean.Person;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @Author: totoro
 * @CreateTime: 2024-06-29
 * @Description:
 */

public class PopulateBeanWithPropertyValuesTest {



    @Test
    public void testPopulateBeanWithPropertyValues(){

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "totoro"));
        propertyValues.addPropertyValue(new PropertyValue("age", 18));
        BeanDefinition beanDefinition = new BeanDefinition(Person.class, propertyValues);
        beanFactory.registerBeanDefinition("person", beanDefinition);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        assertThat(person.getName()).isEqualTo("totoro");
        assertThat(person.getAge()).isEqualTo(18);


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

    public static void main(String[] args) {




    }

}