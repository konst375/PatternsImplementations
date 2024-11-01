package org.chirko.creational;

public interface CarBuilder {
    CarBuilder setCarType(String type);
    CarBuilder setSeats(int seats);
    CarBuilder setEngine(String engine);
    CarBuilder setGearbox(String transmission);
    CarBuilder setWheelDrive(String wheelDrive);
    Car build();
}
