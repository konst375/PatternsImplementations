package org.chirko.creational.factoryMethod;

public class CarbonaraPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new CarbonaraPizza();
    }
}
