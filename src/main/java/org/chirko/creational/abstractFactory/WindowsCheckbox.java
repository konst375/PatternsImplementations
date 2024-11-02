package org.chirko.creational.abstractFactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Windows checkbox");
    }
}
