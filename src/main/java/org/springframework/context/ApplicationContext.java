package org.springframework.context;

import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.core.io.ResourceLoader;

/**
 * @author totoro
 * @date 2024年07月16日 16:50
 * @description 应用上下文
 */

public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {
}
