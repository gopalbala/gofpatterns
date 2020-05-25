package com.gb.gofpatterns.behavioural.visitor.wikipedia;

public class CarMain {
    public static void main(String[] args) {
        CarDeliveryInspector carDeliveryInspector = new CarDeliveryInspector();
        CarServiceEngineer carServiceEngineer = new CarServiceEngineer();

        Door door = new Door();
        Engine engine = new Engine();
        Wheel wheel = new Wheel();

        System.out.println("Service starts here....");
        door.accept(carServiceEngineer);
        engine.accept(carServiceEngineer);
        wheel.accept(carServiceEngineer);
        System.out.println("Service ends here....");
        System.out.println();
        System.out.println("Inspection starts here....");
        wheel.accept(carDeliveryInspector);
        engine.accept(carDeliveryInspector);
        door.accept(carDeliveryInspector);


        System.out.println("Inspection Complete....");

    }
}
