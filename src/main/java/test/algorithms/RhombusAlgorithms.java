package test.algorithms;

import test.beans.Rhombus;

public class RhombusAlgorithms implements Algorithms<Rhombus> {

    @Override
    public double calculateArea(Rhombus rhombus) {
        return rhombus.getA() * rhombus.getH();
    }

    @Override
    public double calculatePerimeter(Rhombus rhombus) {
        return 4 * rhombus.getA();
    }

}