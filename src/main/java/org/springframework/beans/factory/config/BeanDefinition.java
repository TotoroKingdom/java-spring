package org.springframework.beans.factory.config;

import org.springframework.beans.PropertyValues;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description: BeanDefinition实例保存bean的信息，包括class类型、方法构造参数、是否为单例等。
 *               此处只包含class类型和bean属性。
 */

public class BeanDefinition {

    private Class beanClass;

    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass){
        this(beanClass, null);
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues){
        this.beanClass = beanClass;
        this.propertyValues = propertyValues;
    }

    public Class getBeanClass(){
        return beanClass;
    }

    public void setBeanClass(Class beanClass){
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
