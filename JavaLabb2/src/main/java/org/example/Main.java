package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapesList = new ArrayList<>();
        shapesList.add(Shape.createShape("Rectangle", 5.0, 3.0));
        shapesList.add(Shape.createShape("Circle", 6.0));
        shapesList.add(Shape.createShape("Rectangle", 3.0, 2.0));


        Collections.sort(shapesList);

        for (Shape shape : shapesList) {
            System.out.println("Area: " + shape.getArea() + ", Perimeter: " + shape.getPerimeter());
        }

        Set<Shape> shapesSet = new HashSet<>(shapesList);

        System.out.println("Antal unika former: " + shapesSet.size());
    }
}
