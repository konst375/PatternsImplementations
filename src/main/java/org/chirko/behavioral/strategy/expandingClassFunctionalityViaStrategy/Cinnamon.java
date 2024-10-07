package org.chirko.behavioral.strategy.expandingClassFunctionalityViaStrategy;

import java.math.BigDecimal;

public class Cinnamon implements Condiment {
    private final BigDecimal price = BigDecimal.valueOf(0.2);

    @Override
    public String getDescription() {
        return ", Cinnamon on the top";
    }

    @Override
    public BigDecimal getTotalPrice() {
        return price;
    }
}
