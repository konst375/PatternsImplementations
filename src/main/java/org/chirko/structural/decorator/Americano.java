package org.chirko.structural.decorator;

import java.math.BigDecimal;

class Americano implements Beverage {
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
