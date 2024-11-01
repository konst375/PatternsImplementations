package org.chirko.creational;

public class Director {
    public Car createSportscar(CarBuilder builder) {
        return builder
                .setCarType("Sport car")
                .setEngine("3.0L petrol twin turbo porsche engine")
                .setGearbox("automatic 7-speed dual-clutch gearbox")
                .setWheelDrive("FWD")
                .setSeats(4)
                .build();
    }

    public Car createPickup (CarBuilder builder) {
        return builder
                .setCarType("Pickup")
                .setEngine("6.0 petrol twin turbo ford engine")
                .setGearbox("automatic 8-speed dual-clutch gearbox")
                .setWheelDrive("FWD")
                .setSeats(5)
                .build();
    }

    public Car createRoadster (CarBuilder builder) {
        return builder
                .setCarType("Roadster")
                .setEngine("3.0 petrol twin turbo porsche engine")
                .setGearbox("manual 6-speed dual-clutch porsche gearbox")
                .setWheelDrive("RWD")
                .setSeats(2)
                .build();
    }
}
