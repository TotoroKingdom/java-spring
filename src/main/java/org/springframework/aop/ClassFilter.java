package org.springframework.aop;

/**
 * @author: totoro
 * @createDate: 2024 07 23 23 22
 * @description:
 **/
public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
