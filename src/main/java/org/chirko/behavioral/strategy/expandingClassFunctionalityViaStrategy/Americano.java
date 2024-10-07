package org.chirko.behavioral.strategy.expandingClassFunctionalityViaStrategy;

import java.math.BigDecimal;

class Americano extends Beverage {
    private final BigDecimal price = BigDecimal.valueOf(1.5);

    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public BigDecimal getTotalPrice() {
        return price;
    }
}
