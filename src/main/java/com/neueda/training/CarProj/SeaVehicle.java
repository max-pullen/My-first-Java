package com.neueda.training.CarProj;

public class SeaVehicle extends VehicleSuper {

    public String vType;
    public String fType;

    public SeaVehicle(String vType, String fType, String brand, double velocity, String colour, int NoOfPassengers) {
        super(brand, velocity, colour, NoOfPassengers);
        this.vType = vType;
        this.fType = fType;
    }

    public String getvType() {
        return vType;
    }

    public void setvType(String vType) {
        this.vType = vType;
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType;
    }

    @Override
    public void retrieveDetails() {
        System.out.println("\nVehicle Type: " + getvType() + "\nBrand: " + getBrand() + "\nVelocity: " + getVelocity() + "\nColour: " + getColour() +
                "\nNo of Passengers: " + getNoOfPassengers() + "\nFuel Type: " + getfType());
    }

    @Override
    public void accelerates() {
        System.out.println("Pushes throttle forward... anxiously looks at sails");
    }

    @Override
    public void decelerates() {
        System.out.println("Pulls throttle back... looks for the anchor");

    }

    @Override
    public void start() {
        System.out.println("Turns key to start engine...throws ropes off the dock");
    }

    @Override
    public void steer() {
        System.out.println("Turns wheel to steer");

    }
}
