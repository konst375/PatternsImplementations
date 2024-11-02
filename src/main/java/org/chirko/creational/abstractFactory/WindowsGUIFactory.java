package org.chirko.creational.abstractFactory;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public WindowsButton createButton() {
        return new WindowsButton();
    }

    @Override
    public WindowsCheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
