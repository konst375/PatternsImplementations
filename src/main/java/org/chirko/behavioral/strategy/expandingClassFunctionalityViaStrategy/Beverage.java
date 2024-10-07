package org.chirko.behavioral.strategy.expandingClassFunctionalityViaStrategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

abstract class Beverage {
    protected List<Condiment> condiments = new ArrayList<>();

    void addCondiment(Condiment ... condiment) {
        condiments.addAll(List.of(condiment));
    }

    abstract String getDescription();

    abstract BigDecimal getTotalPrice();
}
