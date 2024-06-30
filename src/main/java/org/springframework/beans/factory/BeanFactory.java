package org.springframework.beans.factory;

import org.springframework.beans.factory.BeansException;

import java.util.HashMap;
import java.util.Map;

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

//    private Map<String, Object> beanMap = new HashMap<>();
//
//    public void registerBean(String name, Object bean){
//        beanMap.put(name, bean);
//    }
//
//    public Object getBean(String name){
//        return beanMap.get(name);
//    }

}
