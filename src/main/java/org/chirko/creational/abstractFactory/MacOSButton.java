package org.chirko.creational.abstractFactory;

public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("MacOS button");
    }
}
