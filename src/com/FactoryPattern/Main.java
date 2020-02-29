package com.FactoryPattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 工厂模式
        IVehicleFatory theFactory = new CarFactory();
        IVehicle theVehicle = theFactory.getVehicle();
        theVehicle.drive();

        theFactory = new TractoryFactory();
        theVehicle = theFactory.getVehicle();
        theVehicle.drive();

        theFactory = new TruckFactory();
        theVehicle = theFactory.getVehicle();
        theVehicle.drive();

        /*
         * 可以通过: IVehicleFatory theFactory = new CarFactory(); / new TractoryFactory(); / new TruckFactory();
         * 来实现调用不同的方法
         * 可以看作是一种多态, 满足多态条件:
         * 要有继承关系
         * 要有方法重写
         * 要有父类引用指向子类对象
         * */

        // 简单工厂模式
        SimpleVehicleFactory theSimpleFatory = new SimpleVehicleFactory();
        theVehicle = theSimpleFatory.getVehicle("CAR");
        theVehicle.drive();

        theVehicle = theSimpleFatory.getVehicle("Tractor");
        theVehicle.drive();

        theVehicle = theSimpleFatory.getVehicle("Truck");
        theVehicle.drive();
    }
}
