package shapes;

import abstracts.Shape;
import interfaces.Color;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class Square extends Shape {

    public Square(Color color){
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
