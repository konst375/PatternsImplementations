package org.chirko.behavioral.strategy.expandingClassFunctionalityViaStrategy;

import java.math.BigDecimal;

class Latte extends Beverage {
    private final BigDecimal price = BigDecimal.valueOf(2);
    private final StringBuilder sb = new StringBuilder();

    @Override
    public String getDescription() {
        for (Condiment condiment : condiments) {
            sb.append(condiment.getDescription());
        }
        return "Latte coffee" + sb.toString();
    }

    @Override
    public BigDecimal getTotalPrice() {
        return price;
    }
}
