package org.example;

abstract class Shape implements Comparable<Shape> {
    abstract double getArea();
    abstract double getPerimeter();

    static Shape createShape(String type, double... dimensions) {
        if (type.equalsIgnoreCase("Rectangle")) {
            if (dimensions.length != 2) {
                throw new IllegalArgumentException("There are two dimensions needed for a rectangle");
            }
            return new Rectangle(dimensions[0], dimensions[1]);
        } else if (type.equalsIgnoreCase("Circle")) {
                if (dimensions.length == 0) {
                    throw new IllegalArgumentException("The circle needs a radius, implying at least one dimension");
                }
                return new Circle(dimensions[0]);
        } else {
            throw new IllegalArgumentException("Invalid shape");
        }
        }

        @Override
        public int compareTo(Shape other) {
            double thisArea = this.getArea();
            double otherArea = other.getArea();
            return Double.compare(thisArea, otherArea);
        }
    }
