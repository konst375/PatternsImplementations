package org.chirko.behavioral.strategy.expandingClassFunctionalityViaStrategy;

import java.math.BigDecimal;

public class Chocolate implements Condiment {
    private final BigDecimal price = BigDecimal.valueOf(0.6);

    @Override
    public String getDescription() {
        return ", Chocolate shaving";
    }

    @Override
    public BigDecimal getTotalPrice() {
        return price;
    }
}
