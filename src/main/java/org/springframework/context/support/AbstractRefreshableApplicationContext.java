package org.springframework.context.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author totoro
 * @date 2024年07月16日 17:11
 * @description
 */

public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;

    /**
     * 创建beanFactory并且加载BeanDefinition
     * @throws BeansException
     */
    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    /**
     * 创建bean工厂
     * @return
     */
    protected DefaultListableBeanFactory createBeanFactory(){
        return new DefaultListableBeanFactory();
    }

    /**
     * 加载BeanDefinition
     * @param beanFactory
     * @throws BeansException
     */
    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) throws BeansException;

    public DefaultListableBeanFactory getBeanFactory(){
        return beanFactory;
    }

}
