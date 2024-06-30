package org.springframework.beans.factory.support;

import org.springframework.beans.factory.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description:
 */

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactor {


    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {

        return doCreateBean(beanName, beanDefinition);
    }

    protected Object doCreateBean(String beanName, BeanDefinition beanDefinition){
        Class beanClass = beanDefinition.getBeanClass();
        Object bean = null;
        try {
            bean = beanClass.newInstance();
        } catch (Exception e){
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }
}
