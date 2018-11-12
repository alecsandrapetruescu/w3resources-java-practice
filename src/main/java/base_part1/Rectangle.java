package base_part1;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (getWidth() * getHeight());
    }

    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
