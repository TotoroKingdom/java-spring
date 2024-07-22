package org.springframework.test.common.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * @author: totoro
 * @createDate: 2024 07 22 23 44
 * @description:
 **/
public class CustomEvent extends ApplicationContextEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public CustomEvent(ApplicationContext source) {
        super(source);
    }
}
