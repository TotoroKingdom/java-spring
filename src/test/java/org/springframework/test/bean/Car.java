package org.springframework.test.bean;

/**
 * @Author: totoro
 * @CreateTime: 2024-06-30
 * @Description:
 */

public class Car {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
