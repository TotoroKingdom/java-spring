package org.springframework.context;

import org.springframework.beans.BeansException;

/**
 * @author totoro
 * @date 2024年07月16日 16:52
 * @description
 */

public class ApplicationContextException extends BeansException {
    public ApplicationContextException(String msg) {
        super(msg);
    }

    public ApplicationContextException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
