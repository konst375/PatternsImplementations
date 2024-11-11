package org.chirko.creational.factoryMethod;

public class Pizzeria {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PeperoniPizzaFactory();
        Pizza peperoni = pizzaFactory.createPizza();
        System.out.println(peperoni.toString());

        pizzaFactory = new CarbonaraPizzaFactory();
        Pizza carbonara = pizzaFactory.createPizza();
        System.out.println(carbonara.toString());
    }
}
