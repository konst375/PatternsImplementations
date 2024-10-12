package org.chirko.structural.decorator;

class CoffeeShop {
    public static void main(String[] args) {
        Beverage order1 = new Cinnamon(new CaramelSyrup(new Latte()));
        System.out.println("Order №1: " + order1.getDescription() + "\nTotal cost is: $" + order1.getTotalPrice().toString());
    }
}
