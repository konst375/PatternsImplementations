package org.chirko.creational;

public class PickupCarBuilder extends AbstractCarBuilder {
    public Car build() {
        System.out.println("building pickup car...\ncreating big body...");
        return super.build();
    }
}
