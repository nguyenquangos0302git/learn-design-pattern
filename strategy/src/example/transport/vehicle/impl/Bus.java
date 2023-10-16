package example.transport.vehicle.impl;

import example.transport.vehicle.IVehicle;

public class Bus implements IVehicle {

    @Override
    public void gotoAirport() {
        System.out.println("Bus Strategy");
    }

}
