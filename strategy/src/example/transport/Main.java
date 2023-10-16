package example.transport;

import example.transport.traveler.ITraveler;
import example.transport.traveler.impl.Traveler;
import example.transport.vehicle.IVehicle;
import example.transport.vehicle.impl.Bicycle;
import example.transport.vehicle.impl.Bus;
import example.transport.vehicle.impl.Cab;

public class Main {

    public static void main(String[] args) {
        boolean isCheap = true;
        boolean isFast = false;
        gotoAirport(isCheap, isFast);
    }

    private static void gotoAirport(boolean isCheap, boolean isFast) {
        ITraveler iTraveler = new Traveler();
        IVehicle iVehicle = new Bicycle();
        if (isFast) {
            iVehicle = new Bus();
        } else if (isCheap && isFast) {
            iVehicle = new Cab();
        }

        iTraveler.setIVehicle(iVehicle);
        iTraveler.gotoAirport();
    }

}
