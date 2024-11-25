package main.java.by.rymtsov.lesson15.figure;

/**
 * This class describes the triangle.
 * In getArea method, you can get both area of default triangle
 * and right triangle.
 */

public class Triangle extends Figure {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        if (a != b && b != c && a != c) {
            double halfPerimeter = (a + b + c) / 2;
            area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        } else if (a == b && b == c && a == c) {
            area = (a * a * Math.sqrt(3) / 4);
        }
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = a + b + c;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle" + '\n' +
                "Side a: " + a + '\n' +
                "Side b: " + b + '\n' +
                "Side c: " + c + '\n' +
                "Perimeter: " + getPerimeter() + '\n' +
                "Area: " + getArea() + '\n';
    }
}
