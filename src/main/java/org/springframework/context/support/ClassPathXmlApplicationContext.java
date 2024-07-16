package org.springframework.context.support;

import org.springframework.beans.BeansException;

import java.beans.Beans;

/**
 * @author totoro
 * @date 2024年07月16日 17:24
 * @description xml文件的应用上下文
 */

public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{

    private String[] configLocations;

    /**
     * 从xml文件加载BeanDefinition,并且自动刷新上下文
     * @param configLocation  xml配置文件
     * @throws BeansException 应用上下文创建失败
     */
    public ClassPathXmlApplicationContext(String configLocation) throws BeansException{
        this(new String[]{configLocation});
    }

    /**
     * 从xml文件加载BeanDefinition,并且自动刷新上下文
     * @param configLocations  xml配置文件
     * @throws BeansException  应用上下文创建失败
     */
    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException{
        this.configLocations = configLocations;
        refresh();
    }

    protected String[] getConfigLocations(){
        return this.configLocations;
    }

}
