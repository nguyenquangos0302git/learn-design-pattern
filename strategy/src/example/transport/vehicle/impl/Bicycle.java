package example.transport.vehicle.impl;

import example.transport.vehicle.IVehicle;

public class Bicycle implements IVehicle {

    @Override
    public void gotoAirport() {
        System.out.println("Bicycle Strategy");
    }
    
}
