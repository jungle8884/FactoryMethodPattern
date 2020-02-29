package com.FactoryPattern;

public class TractoryFactory implements IVehicleFatory { // 具体工厂
    @Override
    public IVehicle getVehicle() {
        return new Tractor();
    }
}
