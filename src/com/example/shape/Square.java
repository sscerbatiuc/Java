package com.example.shape;

/**
 * Square.
 *
 * @author sscerbatiuc
 */
public class Square extends Shape {

    public double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    public double getPerimeter() {
        return 4 * sideLength;
    }

    public double getSurface() {
        // Math.pow(sideLength, 2);
        return sideLength * sideLength;
    }

}
