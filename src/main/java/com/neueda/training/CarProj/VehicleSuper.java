package com.neueda.training.CarProj;

public abstract class VehicleSuper implements MoveItMoveIt {
    private String brand;
    private double velocity;
    private String colour;
    private int NoOfPassengers;

    public VehicleSuper(String Brand, double Velocity, String Colour, int NoOfPassengers) {
        this.brand = Brand;
        this.velocity = Velocity;
        this.colour = Colour;
        this.NoOfPassengers = NoOfPassengers;
    }

    public int getNoOfPassengers() {
        return NoOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        NoOfPassengers = noOfPassengers;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
