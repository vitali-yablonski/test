package test.utils;

import test.beans.Circle;
import test.beans.Figure;

public class CircleFilter implements Filter<Figure> {

    @Override
    public boolean filter(Figure figure) {
        return figure.getClass().equals(Circle.class);
    }

}