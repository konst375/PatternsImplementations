package org.chirko.creational.factoryMethod;

import java.util.List;

public class PeperoniPizza extends Pizza {
    public PeperoniPizza() {
        name = "Peperoni Pizza";
        ingredients.addAll(List.of("dough", "cheese", "peperoni", "tomato sauce"));
    }
}
