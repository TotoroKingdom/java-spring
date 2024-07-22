package org.springframework.context;

import java.util.EventObject;

/**
 * @author: totoro
 * @createDate: 2024 07 22 23 11
 * @description:
 **/
public abstract class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
