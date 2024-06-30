package org.springframework.beans.factory.config;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description: 单例注册表
 */

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);


}
