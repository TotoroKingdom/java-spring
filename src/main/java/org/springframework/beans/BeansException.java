package org.springframework.beans;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description:
 */

public class BeansException extends RuntimeException {

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg, Throwable cause){
        super(msg, cause);
    }


}
