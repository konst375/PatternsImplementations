package org.chirko.structural.decorator;

import java.math.BigDecimal;

class Latte implements Beverage {
    private final BigDecimal price = BigDecimal.valueOf(2);

    @Override
    public String getDescription() {
        return "Latte coffee";
    }

    @Override
    public BigDecimal getTotalPrice() {
        return price;
    }
}
