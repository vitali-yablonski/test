package test.algorithms;

import test.beans.Parallelogram;

public class ParallelogramAlgorithms implements Algorithms<Parallelogram> {

    @Override
    public double calculateArea(Parallelogram parallelogram) {
        return parallelogram.getA() * parallelogram.getH();
    }

    @Override
    public double calculatePerimeter(Parallelogram parallelogram) {
        return 2 * (parallelogram.getA() + parallelogram.getB());
    }

}