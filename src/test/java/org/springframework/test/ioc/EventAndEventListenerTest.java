package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.common.event.CustomEvent;

/**
 * @author: totoro
 * @createDate: 2024 07 22 23 46
 * @description:
 **/
public class EventAndEventListenerTest {

    @Test
    public void testEventListener(){

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:event-and-event-listener.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext));

        applicationContext.registerShutdownHook();

        //主动关闭容器
//        applicationContext.close();

    }
}
