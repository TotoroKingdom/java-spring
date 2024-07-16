package org.springframework.test.ioc.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.test.bean.Car;

/**
 * @author totoro
 * @date 2024年07月16日 16:20
 * @description
 */

public class CustomerBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomerBeanPostProcessor#postProcessBeforeInitialization, beanName: " + beanName);
        //换兰博基尼
        if ("car".equals(beanName)){
            ((Car) bean).setBrand("lamborghini");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomerBeanPostProcessor#postProcessAfterInitialization, beanName: " + beanName);
        return bean;
    }
}
