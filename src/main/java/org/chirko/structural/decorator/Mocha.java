package org.chirko.structural.decorator;

import java.math.BigDecimal;

class Mocha implements Beverage {
    private final BigDecimal price = BigDecimal.valueOf(2.5);

    @Override
    public String getDescription() {
        return "Mocha";
    }

    @Override
    public BigDecimal getTotalPrice() {
        return price;
    }
}
