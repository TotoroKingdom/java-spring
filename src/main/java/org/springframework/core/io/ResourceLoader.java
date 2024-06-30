package org.springframework.core.io;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description:
 */

public interface ResourceLoader {

    Resource getResource(String location);
}
