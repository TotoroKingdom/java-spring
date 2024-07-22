package org.springframework.test.common.event;

import org.springframework.context.ApplicationListener;

/**
 * @author: totoro
 * @createDate: 2024 07 22 23 44
 * @description:
 **/
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(this.getClass().getName());
    }
}
