package org.springframework.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.PropertyPermission;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description:
 */

public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv){
        for (int i = 0; i < this.propertyValueList.size(); i++) {
            PropertyValue currentPv = this.propertyValueList.get(i);
            if (currentPv.getName().equals(pv.getName())){
                //覆盖原有的值
                this.propertyValueList.set(i, pv);
                return;
            }
        }

        this.propertyValueList.add(pv);
    }

    public PropertyValue[] getPropertyValues(){
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName){
        for (int i = 0; i < this.propertyValueList.size(); i++) {
            PropertyValue pv = this.propertyValueList.get(i);
            if (pv.getName().equals(propertyName)){
                return pv;
            }
        }
        return null;
    }



}
