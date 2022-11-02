package points;

public class Punkt {
    private int x, y;

    public Punkt() {
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(x=" + x + ",y=" + y + ")" + System.lineSeparator()
                + "Distance from Origo: " + distance()
                + System.lineSeparator();
    }

    public String toStringShort() {
        return "(x=" + x + ",y=" + y + ")" + System.lineSeparator();
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(Punkt otherPoint) {
        int xDiff = otherPoint.x - x;
        int yDiff = otherPoint.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}

