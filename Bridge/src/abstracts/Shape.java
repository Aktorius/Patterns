package abstracts;

import interfaces.Color;

/**
 * Created by Aktorius on 23/04/2017.
 */
public abstract class Shape {

    protected Color color;

    public Shape (Color color){
        this.color = color;
    }

    abstract public void applyColor();
}
