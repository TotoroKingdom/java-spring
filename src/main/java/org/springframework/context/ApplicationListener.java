package org.springframework.context;

import java.util.EventListener;

/**
 * @author: totoro
 * @createDate: 2024 07 22 23 10
 * @description:
 **/
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    void onApplicationEvent(E event);
}
