package base_part1;

public class Circle implements Shape {
    private double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getRadius() {
        return radius;
    }
}
