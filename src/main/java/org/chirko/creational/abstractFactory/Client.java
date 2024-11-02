package org.chirko.creational.abstractFactory;

public class Client {
    public static void main(String[] args) {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSGUIFactory();
        } else {
            factory = new WindowsGUIFactory();
        }
        factory.createButton().render();
        factory.createCheckbox().render();
    }
}
