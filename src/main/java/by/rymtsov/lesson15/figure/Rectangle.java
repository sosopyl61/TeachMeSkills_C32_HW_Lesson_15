package main.java.by.rymtsov.lesson15.figure;

/**
 * This class describes the rectangle.
 */

public class Rectangle extends Figure {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        area = length * width;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * (length + width);
        return perimeter;
    }

    public String toString() {
        return "Rectangle" + '\n' +
                "Length: " + length + '\n' +
                "Width: " + width + '\n' +
                "Perimeter: " + getPerimeter() + '\n' +
                "Area: " + getArea() + '\n';
    }
}
