package main.java.by.rymtsov.lesson15.figure;

/**
 * This class describes the circle.
 * The number PI is a constant;
 */

public class Circle extends Figure {
    final double PI = 3.14159265358979323846;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        area = PI * radius * radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * PI * radius;
        return perimeter;
    }

    public String toString() {
        return "Circle" + '\n' +
                "Radius: " + radius + '\n' +
                "Perimeter: " + getPerimeter() + '\n' +
                "Area: " + getArea() + '\n';
    }
}
