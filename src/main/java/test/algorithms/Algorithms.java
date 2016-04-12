package test.algorithms;

import test.beans.Figure;

public interface Algorithms<F extends Figure> {

   public double calculateArea(F figure);

   public double calculatePerimeter(F figure);

}