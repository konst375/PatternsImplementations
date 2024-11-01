package org.chirko.creational;

public class AbstractCarBuilder implements CarBuilder {
    protected String carType;
    protected int seats;
    protected String engine;
    protected String transmission;
    protected String wheelDrive;

    @Override
    public CarBuilder setCarType(String carType) {
        this.carType = carType;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setGearbox(String transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder setWheelDrive(String wheelDrive) {
        this.wheelDrive = wheelDrive;
        return this;
    }

    public Car build() {
        return new Car(carType, seats, engine, transmission, wheelDrive);
    }
}
