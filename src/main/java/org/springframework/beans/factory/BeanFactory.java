package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-29
 * @Description: bean工厂
 */

public class BeanFactory {

    private Map<String, Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean){
        beanMap.put(name, bean);
    }

    public Object getBean(String name){
        return beanMap.get(name);
    }

}
