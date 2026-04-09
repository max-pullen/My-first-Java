package com.neueda.training.CarProj;

public class LandVehicle extends VehicleSuper{

    public String vType;
    public int NoWheels;

    public LandVehicle(String vType, int NoWheels, String brand, double velocity, String colour, int NoOfPassengers) {
        super(brand, velocity, colour, NoOfPassengers);
        this.vType = vType;
        this.NoWheels = NoWheels;
    }

    public String getvType() {
        return vType;
    }

    public void setvType(String vType) {
        this.vType = vType;
    }

    public int getNoWheels() {
        return NoWheels;
    }

    public void setNoWheels(int noWheels) {
        NoWheels = noWheels;
    }

    @Override
    public void retrieveDetails() {
        System.out.println("\nVehicle Type: " + getvType() + "\nBrand: " + getBrand() + "\nVelocity: " + getVelocity() + "\nColour: " + getColour() +
                "\nNo of Passengers: " + getNoOfPassengers() + "\nNumber of Wheels: " + getNoWheels());
    }

    @Override
    public void accelerates() {
        System.out.println("Makes wheels go faster");
    }

    @Override
    public void decelerates() {
        System.out.println("Makes wheels go slower");

    }

    @Override
    public void start() {
        System.out.println("Unlocks and takes off");

    }

    @Override
    public void steer() {
        System.out.println("Turns wheel to steer");

    }
}
