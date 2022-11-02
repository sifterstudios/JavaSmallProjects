package points;

public class Line {
    private Punkt pointA;
    private Punkt pointB;

    public Line(Punkt pointA, Punkt pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Line() {
        pointA = new Punkt();
        pointB = new Punkt();
    }

    public Punkt getPointA() {
        return pointA;
    }

    public void setPointA(Punkt pointA) {
        this.pointA = pointA;
    }

    public Punkt getPointB() {
        return pointB;
    }

    public void setPointB(Punkt pointB) {
        this.pointB = pointB;
    }

    public void setPointAB(Punkt pointA, Punkt pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Punkt[] getPointAB() {
        return new Punkt[]{pointA, pointB};
    }

    public String toString() {
        return "a=" + pointA.toStringShort() + ",b=" + pointB.toStringShort();
    }
}