package org.springframework.beans.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;

/**
 * @author: totoro
 * @createDate: 2024 07 14 23 39
 * @description:
 **/
public interface ConfigurableListableBeanFactory extends ListableBeanFactory{

    /**
     * 根据名称查找BeanDefinition
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 提前实例化所有单例实例
     * @throws BeansException
     */
    void preInstantiateSingletons() throws BeansException;

}
