package org.springframework.beans.factory.support;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description:
 */

public abstract class AbstractBeanFactor extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null){
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);

        return createBean(name, beanDefinition);
    }

    protected abstract boolean containsBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition)throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;


}
