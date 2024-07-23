package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author: totoro
 * @createDate: 2024 07 23 23 21
 * @description:
 **/
public interface MethodMatcher {

    boolean matches(Method method, Class<?> targetClass);
}
