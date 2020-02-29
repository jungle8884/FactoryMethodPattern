package com.FactoryPattern;

public class TruckFactory implements IVehicleFatory { // 具体工厂
    @Override
    public IVehicle getVehicle() {
        return new Truck();
    }
}
