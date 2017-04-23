package shapes;

import abstracts.Shape;
import interfaces.Color;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class Circle extends Shape {

    public Circle(Color color){
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
