package test.beans;

public class Circle extends Figure {

    private int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle { r = " + r + ", " + super.toString() + " }";
    }

}