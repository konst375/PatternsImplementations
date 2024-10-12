package org.chirko.structural.decorator;

import java.math.BigDecimal;

class Cinnamon extends Condiment {
    private final BigDecimal price = BigDecimal.valueOf(0.2);

    public Cinnamon(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Cinnamon on the top";
    }

    @Override
    public BigDecimal getTotalPrice() {
        return beverage.getTotalPrice().add(price);
    }
}
