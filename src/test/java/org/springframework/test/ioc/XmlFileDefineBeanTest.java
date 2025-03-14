package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.test.bean.Car;
import org.springframework.test.bean.Person;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @Author: totoro
 * @CreateTime: 2024-07-06
 * @Description:
 */

public class XmlFileDefineBeanTest {

    @Test
    public void testXmlFile() throws Exception{
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);

        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        assertThat(person.getName()).isEqualTo("totoro");
        assertThat(person.getCar().getBrand()).isEqualTo("mercedes");

        Car car = (Car) beanFactory.getBean("car");
        System.out.println(car);
        assertThat(car.getBrand()).isEqualTo("mercedes");

    }
}
