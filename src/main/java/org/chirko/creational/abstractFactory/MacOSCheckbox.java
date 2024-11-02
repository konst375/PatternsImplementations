package org.chirko.creational.abstractFactory;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("MacOS checkbox");
    }
}
