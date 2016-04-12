package test;

import test.beans.*;
import test.utils.Calculator;
import test.utils.CircleFilter;
import test.utils.PerimeterComparator;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Figure> figures1 = new ArrayList<Figure>(){{
        add(new Circle(10));
        add(new Square(5));
        add(new Rhombus(10, 15));
        add(new Triangle(10, 20));
        add(new Parallelogram(10, 20, 15));
    }};

    private static List<Figure> figures2 = new ArrayList<Figure>(){{
        add(new Circle(10));
        add(new Square(5));
    }};

    private static List<Figure> figures3 = new ArrayList<Figure>(){{
        add(new Rhombus(10, 15));
        add(new Triangle(10, 20));
        add(new Parallelogram(10, 20, 15));
    }};

    private static List<Figure> figures4 = new ArrayList<Figure>(){{
        add(new Circle(10));
        add(new Square(5));
        add(new Circle(5));
        add(new Circle(15));
    }};

    public static void main(String[] a) {
        println(Calculator.newInstance().add(figures1).calculateArea().calculatePerimeter().getList());
        println(Calculator.newInstance().add(figures2).add(figures3).calculateArea().calculatePerimeter().getList());
        println(Calculator.newInstance().add(figures4).filter(new CircleFilter()).calculatePerimeter().sort(new PerimeterComparator()).getList());
    }

    private static void println(List<Figure> figures) {
        System.out.println("\nTest: ");
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }

}