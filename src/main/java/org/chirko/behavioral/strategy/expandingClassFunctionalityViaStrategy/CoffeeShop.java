package org.chirko.behavioral.strategy.expandingClassFunctionalityViaStrategy;

class CoffeeShop {
    public static void main(String[] args) {
        Beverage beverage = new Latte();
        beverage.addCondiment(new CaramelSyrup(), new Cinnamon());
        System.out.println(beverage.getDescription());
    }
}
