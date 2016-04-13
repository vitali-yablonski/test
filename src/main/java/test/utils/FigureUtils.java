package test.utils;

import test.algorithms.Algorithms;
import test.algorithms.CircleAlgorithms;
import test.algorithms.ParallelogramAlgorithms;
import test.algorithms.RhombusAlgorithms;
import test.algorithms.SquareAlgorithms;
import test.algorithms.TriangleAlgorithms;
import test.beans.Circle;
import test.beans.Figure;
import test.beans.Parallelogram;
import test.beans.Rhombus;
import test.beans.Square;
import test.beans.Triangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureUtils {

    private Map<Class, Algorithms> algorithms = new HashMap<Class, Algorithms>(){{
        put(Circle.class, new CircleAlgorithms());
        put(Square.class, new SquareAlgorithms());
        put(Rhombus.class, new RhombusAlgorithms());
        put(Triangle.class, new TriangleAlgorithms());
        put(Parallelogram.class, new ParallelogramAlgorithms());
    }};

    private List<Figure> figures = new ArrayList<Figure>();

    private FigureUtils() {
    }

    public static FigureUtils newInstance() {
        return new FigureUtils();
    }

    public FigureUtils add(Figure figure) {
        this.figures.add(figure);
        return this;
    }

    public FigureUtils add(List<Figure> figures) {
        this.figures.addAll(figures);
        return this;
    }

    public FigureUtils calculateArea() {
        for (Figure figure : figures) {
            double area = algorithms.get(figure.getClass()).calculateArea(figure);
            figure.setArea(area);
        }
        return this;
    }

    public FigureUtils calculatePerimeter() {
        for (Figure figure : figures) {
            double perimeter = algorithms.get(figure.getClass()).calculatePerimeter(figure);
            figure.setPerimeter(perimeter);
        }
        return this;
    }

    public FigureUtils filter(Filter<Figure> filter) {
        List<Figure> collectFigures = new ArrayList<Figure>();
        for (Figure figure : figures) {
            if (filter.filter(figure)) {
                collectFigures.add(figure);
            }
        }
        this.figures = collectFigures;
        return this;
    }

    public FigureUtils sort(Comparator<Figure> comparator) {
        Collections.sort(figures, comparator);
        return this;
    }

    public List<Figure> getList() {
        return figures;
    }

}