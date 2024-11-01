package org.chirko.creational;

public class RoadsterCarBuilder extends AbstractCarBuilder {
    public Car build() {
        System.out.println("building roadster...\nadding only two seats...\nputting decent engine");
        return super.build();
    }
}
