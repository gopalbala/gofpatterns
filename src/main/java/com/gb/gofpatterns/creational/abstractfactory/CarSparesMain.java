package com.gb.gofpatterns.creational.abstractfactory;

public class CarSparesMain {
    public static void main(String[] args) {
        System.out.println("Customer1 ordering Mahindra door handle of Color " + Color.WHITE);
        DoorFactory doorFactory = new MahindraDoorFactory();
        DoorHandle doorHandle = doorFactory.getHandle(CarType.SUV, Color.WHITE);
        System.out.println("Delivering Handle " +
                doorHandle.getDescription()  //"with color " + doorHandle.getColor()
                + "for customer with price " + doorHandle.getPrice());

        DoorFactory factory = new TataDoorFactory();
        DoorHandle tataSedanHandle = factory.getHandle(CarType.SEDAN, Color.ORANGE);

        System.out.println("Delivering Handle " +
                tataSedanHandle.getDescription()  //"with color " + doorHandle.getColor()
                + "for customer with price " + tataSedanHandle.getPrice());
    }
}
