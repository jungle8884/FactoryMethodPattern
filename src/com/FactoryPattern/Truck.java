package com.FactoryPattern;

public class Truck implements IVehicle { // 具体产品
    @Override
    public void drive() {
        System.out.println("开卡车");
    }
}
