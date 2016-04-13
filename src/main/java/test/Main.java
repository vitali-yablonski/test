package test;

import test.beans.Circle;
import test.beans.Figure;
import test.beans.Parallelogram;
import test.beans.Rhombus;
import test.beans.Square;
import test.beans.Triangle;
import test.utils.FigureUtils;
import test.utils.CircleFilter;
import test.utils.Filter;
import test.utils.PerimeterComparator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

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

    public static void main(String[] arg) {
        // calculate the area and perimeter of each figure from the list
        println(FigureUtils.newInstance().add(figures1).calculateArea().calculatePerimeter().getList());

        // make batch calculation of area and perimeter for list of figures
        println(FigureUtils.newInstance().add(figures2).add(figures3).calculateArea().calculatePerimeter().getList());

        // sort figures by area or perimeter and filter by type
        Filter<Figure> circleFilter = new CircleFilter();
        Comparator<Figure> perimeterComparator = new PerimeterComparator();
        println(FigureUtils.newInstance().add(figures4).filter(circleFilter).calculatePerimeter().sort(perimeterComparator).getList());
    }

    private static void println(List<Figure> figures) {
        logger.info("Test:");
        for (Figure figure : figures) {
            logger.info(figure.toString());
        }
    }

}