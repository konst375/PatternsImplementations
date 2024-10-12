package org.chirko.structural.decorator;

import java.math.BigDecimal;

class Cappuccino implements Beverage {
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
