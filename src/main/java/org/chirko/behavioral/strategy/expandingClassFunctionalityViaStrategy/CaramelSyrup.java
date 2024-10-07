package org.chirko.behavioral.strategy.expandingClassFunctionalityViaStrategy;

import java.math.BigDecimal;

public class CaramelSyrup implements Condiment {
    private final BigDecimal price = BigDecimal.valueOf(0.3);
    @Override
    public String getDescription() {
        return ", Caramel Syrup";
    }

    @Override
    public BigDecimal getTotalPrice() {
        return price;
    }
}
