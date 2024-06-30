package org.springframework.beans;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description: bean属性信息
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public Object getValue(){
        return value;
    }
}
