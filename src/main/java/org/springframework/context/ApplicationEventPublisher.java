package org.springframework.context;

/**
 * @author: totoro
 * @createDate: 2024 07 22 23 13
 * @description: 事件发布者接口
 **/
public interface ApplicationEventPublisher {

    /**
     * 发布事件
     * @param event
     */
    void publishEvent(ApplicationEvent event);

}
