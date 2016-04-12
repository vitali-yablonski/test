package test.algorithms;

import test.beans.Circle;

public class CircleAlgorithms implements Algorithms<Circle> {

    @Override
    public double calculateArea(Circle circle) {
        return Math.PI * Math.pow(circle.getR(), 2);
    }

    @Override
    public double calculatePerimeter(Circle circle) {
        return 2 * Math.PI * circle.getR();
    }

}