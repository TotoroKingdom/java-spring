package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description:
 */

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    private final Map<String, DisposableBean> disposableBeans = new HashMap<>();

    protected void addSingleton(String beanName, Object singletonObject){
        singletonObjects.put(beanName, singletonObject);
    }

    public void registerDisposableBean(String beanName, DisposableBean bean){
        disposableBeans.put(beanName, bean);
    }

    public void destroySingletons(){
        Set<String> beanNames = disposableBeans.keySet();
        for (String beanName : beanNames) {
            DisposableBean disposableBean = disposableBeans.remove(beanName);
            try{
                disposableBean.destroy();
            } catch (Exception e){
                throw new BeansException("Destroy method on bean with me '" + beanName + "' threw an exception", e);
            }

        }
    }

}
