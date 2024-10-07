package org.chirko.behavioral.strategy.expandingClassFunctionalityViaStrategy;

import java.math.BigDecimal;

class Cappuccino extends Beverage {
    private final BigDecimal price = BigDecimal.valueOf(2);

    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public BigDecimal getTotalPrice() {
        return price;
    }
}
