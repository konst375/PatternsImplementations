package org.chirko.structural.decorator;

import java.math.BigDecimal;

class Chocolate extends Condiment {
    private final BigDecimal price = BigDecimal.valueOf(0.6);
    public Chocolate(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate shaving";
    }

    @Override
    public BigDecimal getTotalPrice() {
        return beverage.getTotalPrice().add(price);
    }
}
