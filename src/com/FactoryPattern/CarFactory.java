package com.FactoryPattern;

public class CarFactory implements IVehicleFatory { // 具体工厂
    @Override
    public IVehicle getVehicle() {
        return new Car();
    }
}
