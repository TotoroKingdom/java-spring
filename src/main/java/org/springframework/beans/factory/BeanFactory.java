package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-29
 * @Description: bean工厂
 */

public interface BeanFactory {


    /**
     * 获取bean
     * @param name
     * @return
     * @throws BeansException
     */
    Object getBean(String name) throws BeansException;

    /**
     * 根据名称和类型查找bean
     * @param name
     * @param requiredType
     * @return
     * @param <T>
     * @throws BeansException
     */
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

}
