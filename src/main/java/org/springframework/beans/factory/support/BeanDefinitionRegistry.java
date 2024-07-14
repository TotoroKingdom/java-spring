package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description: 注册表
 */

public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注入BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);


    /**
     * 返回定义的所有bean的名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
