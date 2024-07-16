package org.springframework.context;

import org.springframework.beans.BeansException;

/**
 * @author totoro
 * @date 2024年07月16日 16:53
 * @description
 */

public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新容器
     * @throws BeansException
     */
    void refresh() throws BeansException;

}
