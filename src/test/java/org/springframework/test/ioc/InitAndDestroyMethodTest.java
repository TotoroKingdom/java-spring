package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author totoro
 * @date 2024年07月17日 11:58
 * @description
 */

public class InitAndDestroyMethodTest {

    @Test
    public void testInitAndDestroyMethod(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:init-and-destroy-method.xml");
        applicationContext.registerShutdownHook(); //关闭
    }
}
