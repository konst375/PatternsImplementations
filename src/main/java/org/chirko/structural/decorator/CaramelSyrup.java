package org.chirko.structural.decorator;

import java.math.BigDecimal;

class CaramelSyrup extends Condiment {
    private final BigDecimal price = BigDecimal.valueOf(0.3);

    public CaramelSyrup(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Caramel Syrup";
    }

    @Override
    public BigDecimal getTotalPrice() {
        return beverage.getTotalPrice().add(price);
    }
}
