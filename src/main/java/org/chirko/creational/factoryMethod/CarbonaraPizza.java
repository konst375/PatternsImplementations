package org.chirko.creational.factoryMethod;

import java.util.List;

public class CarbonaraPizza extends Pizza {
    public CarbonaraPizza() {
        name = "Carbonara Pizza";
        ingredients.addAll(List.of("dough", "mozzarella", "parmesan", "bacon", "tomato", "onion", "garlic"));
    }
}
