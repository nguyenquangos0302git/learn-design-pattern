package example.transport.traveler.impl;

import example.transport.traveler.ITraveler;
import example.transport.vehicle.IVehicle;

public class Traveler implements ITraveler {

    private IVehicle iVehicle;

    @Override
    public void setIVehicle(IVehicle iVehicle) {
        this.iVehicle = iVehicle;
    }

    @Override
    public void gotoAirport() {
        iVehicle.gotoAirport();
    }

}
