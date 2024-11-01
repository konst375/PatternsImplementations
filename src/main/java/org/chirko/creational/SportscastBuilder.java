package org.chirko.creational;

public class SportscastBuilder extends AbstractCarBuilder {
    public Car build() {
        System.out.println("building sport car...\nmany tests passing...");
        return super.build();
    }
}
