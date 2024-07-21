package org.springframework.beans.factory;

/**
 * @author: totoro
 * @createDate: 2024 07 21 23 45
 * @description:
 **/
public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
