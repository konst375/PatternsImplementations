package org.chirko.structural.composite;

import java.awt.*;

//Leaf
public class Rectangle extends BaseShape {
    private int height;
    private int width;

    public Rectangle(int x, int y, int height, int width, Color color) {
        super(x, y, color);
        this.height = height;
        this.width = width;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1);
    }
}
