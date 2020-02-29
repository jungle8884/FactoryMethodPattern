package com.FactoryPattern;

public class Tractor implements IVehicle { // 具体产品
    @Override
    public void drive() {
        System.out.println("开拖拉机");
    }
}
