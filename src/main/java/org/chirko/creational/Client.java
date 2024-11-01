package org.chirko.creational;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        System.out.println(director.createSportscar(new SportscastBuilder()));
        System.out.println(director.createPickup(new PickupCarBuilder()));
        System.out.println(director.createRoadster(new RoadsterCarBuilder()));
    }
}
