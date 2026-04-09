package com.neueda.training.CarProj;

import java.util.ArrayList;
import java.util.List;

public class VehiTest {
    public static void main(String[] args) {

//     Example of how to write a list properly and add items to it
//     The list below it is an alternative slightly weirder way of making a list and initialising it with items in one line
//        List <VehicleSuper> vehiclelist = new ArrayList<>();
//        vehiclelist.add (new LandVehicle("Car", 4, "toyota", 120, "red", 4));
//
//
        List<VehicleSuper> vehicleList = List.of(
                new LandVehicle("Car", 4, "toyota", 120, "red", 4),
                new SeaVehicle("Boat", "Sailboat", "RR", 80, "white", 4),
                new LandVehicle("Bike", 2, "Specialized", 40, "blue", 1));

//        VehicleSuper[] vehicles = new VehicleSuper[3];
//        vehicles[0] = new LandVehicle("Car", 4, "toyota", 120, "red", 4);
//        vehicles[1] = new SeaVehicle("Boat", "Sailboat", "RR", 80, "white", 4);
//        vehicles[2] = new LandVehicle("Bike", 2, "Specialized", 40, "blue", 1);

        for (VehicleSuper vehicle : vehicleList) {
            vehicle.retrieveDetails();
            System.out.println("Things you do with the vehicle:");
            vehicle.start();
            vehicle.accelerates();
            vehicle.decelerates();
            vehicle.steer();
            System.out.println();
        }
// make a list of all the vehicles and loop through them to call all the methods



    }
}
