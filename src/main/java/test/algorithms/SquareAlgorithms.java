package test.algorithms;

import test.beans.Square;

public class SquareAlgorithms implements Algorithms<Square> {

    @Override
    public double calculateArea(Square square) {
        return Math.pow(square.getA(), 2);
    }

    @Override
    public double calculatePerimeter(Square square) {
        return 4 * square.getA();
    }

}