package example.transport.vehicle.impl;

import example.transport.vehicle.IVehicle;

public class Cab implements IVehicle {

    @Override
    public void gotoAirport() {
        System.out.println("Cab Strategy");
    }
    
}
