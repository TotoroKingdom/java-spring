package org.springframework.beans.factory.support;

import org.springframework.beans.factory.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description:
 */

public class
CglibSubclassingInstantiationStrategy implements InstantiationStrategy{
    /**
     * 使用CGLIB动态生成子类
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        // TODO: 2024/6/30 待实现
        return new UnsupportedOperationException("CGLIB instantiation strategy is not supported");
    }
}
