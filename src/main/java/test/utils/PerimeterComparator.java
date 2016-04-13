package test.utils;

import test.beans.Figure;
import java.util.Comparator;

public class PerimeterComparator implements Comparator<Figure>{

    @Override
    public int compare(Figure figure1, Figure figure2) {
        Long result = Math.round(figure1.getPerimeter() - figure2.getPerimeter());
        return result.intValue();
    }

}