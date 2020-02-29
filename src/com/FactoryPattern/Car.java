package com.FactoryPattern;

public class Car implements IVehicle { // 具体产品
    @Override
    public void drive() {
        System.out.println("开小汽车");
    }
}
