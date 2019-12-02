package com.example.main;

import com.example.shape.Square;
import com.example.shape.Shape;
import com.example.shape.Rectangle;

/**
 * Main class
 *
 * @author sscerbatiuc
 */
public class App {

    public static void main(String[] args) {
        String[] colorsArr = new String[]{"blue", "red"};
        Shape[] shapes = new Shape[20];

        for (int i = 0; i < shapes.length; i++) {
            int colorIndex = i % 2 == 0 ? 0 : 1;
            shapes[i] = i % 2 == 0
                    ? new Square(colorsArr[colorIndex], (i + 1) * 20)
                    : new Rectangle(colorsArr[colorIndex], (i + 1) * 20, i + 1);
        }

        for (Shape shape : shapes) {
            System.out.println("Figure: ");
            System.out.println(shape.getPerimeter());
            System.out.println(shape.getSurface());
        }
    }

}
