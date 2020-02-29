package com.FactoryPattern;

public class SimpleVehicleFactory { // 简单工厂模式
    // 如果只有TRUCK、CAR和TRACTOR三种车辆，不会有其它车辆时
    public IVehicle getVehicle(String vehicleType){

        if(vehicleType.equalsIgnoreCase("CAR")){
            return new Car();
        }else if(vehicleType.equalsIgnoreCase("Tractor")){
            return  new Tractor();
        }else if(vehicleType.equalsIgnoreCase("Truck")){
            return new Truck();
        }

        return null;
    }
}
