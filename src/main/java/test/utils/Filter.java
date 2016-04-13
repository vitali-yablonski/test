package test.utils;

import test.beans.Figure;

public interface Filter<F extends Figure> {

    public boolean filter(F figure);

}