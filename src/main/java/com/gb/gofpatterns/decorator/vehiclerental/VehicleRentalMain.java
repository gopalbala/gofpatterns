package com.gb.gofpatterns.decorator.vehiclerental;

public class VehicleRentalMain {
    public static void main(String[] args) {
        HireableVehicle hondaCity = new HondaCity();
        hondaCity = new FestiveOfferDecorator(hondaCity);

        System.out.println("Festive offer " + hondaCity.getPrice());

        hondaCity = new
                FestiveOfferDecorator(new AfternoonHireDecorator(new HondaCity()));
        System.out.println("Festive offer hired in afternoon " + hondaCity.getPrice());

        HireableVehicle hondaCity1 = new
                PeakSeasonDecorator(new AfternoonHireDecorator(new HondaCity()));

        HireableVehicle hondaUnicorn = new HondaUnicorn();
        hondaUnicorn = new AfternoonHireDecorator(new WorkingDayDecorator(hondaUnicorn));


        System.out.println("Hiring vehicle on working day with price " + hondaUnicorn.getPrice());


        System.out.println("Peak season hired in afternoon " + hondaCity1.getPrice());
    }
}
