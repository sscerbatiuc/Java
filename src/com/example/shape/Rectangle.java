package com.example.shape;

/**
 * Child class.
 *
 * @author sscerbatiuc
 */
public class Rectangle extends Shape {

    public double sideLength, sideWidth;

    public Rectangle(String color, double sideLength, double sideWidth) {
        super(color);
        this.sideLength = sideLength;
        this.sideWidth = sideWidth;
    }

    public double getPerimeter() {
        return 2 * (sideLength + sideWidth);
    }

    public double getSurface() {
        return sideLength * sideWidth;
    }
}
