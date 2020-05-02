package com.gb.gofpatterns.visitor.wikipedia;

public class CarMain {
    public static void main(String[] args) {
        CarDeliveryInspector carDeliveryInspector = new CarDeliveryInspector();
        System.out.println("Inspection starts here....");
        Door door = new Door();
        door.accept(carDeliveryInspector);
        Engine engine = new Engine();
        engine.accept(carDeliveryInspector);
        Wheel wheel = new Wheel();
        wheel.accept(carDeliveryInspector);
        System.out.println("Inspection Complete....");

    }
}
