package org.springframework.core.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description: 资源的抽象和访问接口
 */

public interface Resource {

    InputStream getInputStream() throws IOException;

}
