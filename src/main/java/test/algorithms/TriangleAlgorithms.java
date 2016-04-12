package test.algorithms;

import test.beans.Triangle;

public class TriangleAlgorithms implements Algorithms<Triangle> {

    @Override
    public double calculateArea(Triangle triangle) {
        return triangle.getA() * triangle.getB();
    }

    @Override
    public double calculatePerimeter(Triangle triangle) {
        return 2 * (triangle.getA() + triangle.getB());
    }

}