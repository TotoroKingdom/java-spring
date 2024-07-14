package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

import java.util.Map;

/**
 * @author: totoro
 * @createDate: 2024 07 14 23 37
 * @description:
 **/
public interface ListableBeanFactory extends BeanFactory{

    /**
     * 返回指定类型的所有实例
     * @param type
     * @return
     * @param <T>
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

}
