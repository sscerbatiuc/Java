package com.example.shape;

/**
 * Abstract class containing all the common fields and methods.
 *
 * @author sscerbatiuc
 */
public abstract class Shape {

    public String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getPerimeter();

    public abstract double getSurface();
}
