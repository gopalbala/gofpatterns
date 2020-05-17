package com.gb.gofpatterns.abstractfactory.carspares;

public class CarSparesMain {
    public static void main(String[] args) {
        System.out.println("Customer1 ordering Mahindra door handle of Color " + Color.WHITE);
        DoorFactory doorFactory = new MahindraDoorFactory();
        Handle handle = doorFactory.getHandle(CarType.SUV, Color.WHITE);
        System.out.println("Delivering Handle " +
                handle.getDescription() + "with color " + handle.getColor()
                + "for customer with price " + handle.getPrice());
    }
}
