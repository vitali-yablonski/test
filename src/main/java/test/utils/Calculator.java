package test.utils;

import test.algorithms.*;
import test.beans.*;
import java.util.*;

public class Calculator {

    private Map<Class, Algorithms> algorithms = new HashMap<Class, Algorithms>(){{
        put(Circle.class, new CircleAlgorithms());
        put(Square.class, new SquareAlgorithms());
        put(Rhombus.class, new RhombusAlgorithms());
        put(Triangle.class, new TriangleAlgorithms());
        put(Parallelogram.class, new ParallelogramAlgorithms());
    }};

    private List<Figure> figures = new ArrayList<Figure>();

    private Calculator() {
    }

    public static Calculator newInstance() {
        return new Calculator();
    }

    public Calculator add(Figure figure) {
        this.figures.add(figure);
        return this;
    }

    public Calculator add(List<Figure> figures) {
        this.figures.addAll(figures);
        return this;
    }

    public Calculator calculateArea() {
        for (Figure figure : figures) {
            double area = algorithms.get(figure.getClass()).calculateArea(figure);
            figure.setArea(area);
        }
        return this;
    }

    public Calculator calculatePerimeter() {
        for (Figure figure : figures) {
            double perimeter = algorithms.get(figure.getClass()).calculatePerimeter(figure);
            figure.setPerimeter(perimeter);
        }
        return this;
    }

    public Calculator filter(Filter filter) {
        List<Figure> collectFigures = new ArrayList<Figure>();
        for (Figure figure : figures) {
            if (filter.filter(figure)) {
                collectFigures.add(figure);
            }
        }
        this.figures = collectFigures;
        return this;
    }

    public Calculator sort(Comparator<Figure> comparator) {
        Collections.sort(figures, comparator);
        return this;
    }

    public List<Figure> getList() {
        return figures;
    }

}