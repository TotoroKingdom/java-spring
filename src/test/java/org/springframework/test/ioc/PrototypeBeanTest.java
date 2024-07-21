package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.Car;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author: totoro
 * @createDate: 2024 07 21 23 32
 * @description:
 **/
public class PrototypeBeanTest {

    @Test
    public void testPrototype(){

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");

        Car car = applicationContext.getBean("car", Car.class);
        Car car1 = applicationContext.getBean("car", Car.class);
        assertThat(car1 != car).isTrue();

    }
}
