package org.springframework.aop;

/**
 * @author: totoro
 * @createDate: 2024 07 23 23 20
 * @description: 切点抽象
 **/
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();


}
