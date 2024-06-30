package org.springframework.beans.factory.config;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description: 一个bean对另一个bean的引用
 */

public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
