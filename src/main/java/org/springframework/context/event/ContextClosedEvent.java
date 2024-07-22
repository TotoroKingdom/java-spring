package org.springframework.context.event;

/**
 * @author: totoro
 * @createDate: 2024 07 22 23 29
 * @description:
 **/
public class ContextClosedEvent extends ApplicationContextEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
