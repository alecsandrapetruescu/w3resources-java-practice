package base_part1;

public class Hexagon implements Shape {
    private int length;

    public Hexagon(int length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return (6 * getLength() ^ 2) / (4 * Math.tan(Math.PI / 6));
    }

    public int getLength() {
        return length;
    }
}
