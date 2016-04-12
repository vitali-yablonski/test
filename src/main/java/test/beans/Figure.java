package test.beans;

public abstract class Figure {

    private double area;

    private double perimeter;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "area = " + area + ", perimeter = " + perimeter;
    }

}