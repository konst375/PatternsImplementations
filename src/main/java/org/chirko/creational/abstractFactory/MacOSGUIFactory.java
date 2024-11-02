package org.chirko.creational.abstractFactory;

public class MacOSGUIFactory implements GUIFactory {
    @Override
    public MacOSButton createButton() {
        return new MacOSButton();
    }

    @Override
    public MacOSCheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
