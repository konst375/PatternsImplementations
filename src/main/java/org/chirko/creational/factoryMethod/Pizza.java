package org.chirko.creational.factoryMethod;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public abstract class Pizza {
    protected String name;
    protected int calories;
    protected int weight;
    protected List<String> ingredients = new ArrayList<>();
}
