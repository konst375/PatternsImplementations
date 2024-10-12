package org.chirko.structural.decorator;

import java.math.BigDecimal;

class Espresso implements Beverage {
    private final BigDecimal price = BigDecimal.valueOf(1.1);

    @Override
    public String getDescription() {
        return "Espresso coffee";
    }

    @Override
    public BigDecimal getTotalPrice() {
        return price;
    }
}
