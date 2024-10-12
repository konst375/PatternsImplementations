package org.chirko.structural.decorator;

abstract class Condiment implements Beverage {
    protected Beverage beverage;

    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }
}
