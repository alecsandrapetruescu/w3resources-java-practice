package base_part1;

public class Polygon implements Shape {
    private int length;
    private int nrOfSides;

    public Polygon(int length, int nrOfSides) {
        this.length = length;
        this.nrOfSides = nrOfSides;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return (getNrOfSides() * getLength() ^ 2) / (4 * Math.tan(Math.PI / getNrOfSides()));
    }

    public int getLength() {
        return length;
    }

    public int getNrOfSides() {
        return nrOfSides;
    }
}
