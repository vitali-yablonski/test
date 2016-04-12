package test.beans;

public class Square extends Figure {

    private int a;

    public Square() {
    }

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Square { a = " + a + ", " + super.toString() + " }";
    }

}