package main.java.aktorius.com.application;


import abstracts.Shape;
import colors.*;
import interfaces.Color;
import shapes.*;

/**
 * Created by Aktorius on 20/04/2017.
 */
public class PatternsDemo {

    public static void main (String[] args){
        Color blue = new Blue();
        Color red = new Red();
        Color green = new Green();

        Shape square = new Square(blue);
        Shape circle = new Circle(red);
        Shape greenCircle = new Circle(green);
        Shape greenSquare = new Square(green);

        square.applyColor();
        circle.applyColor();
        greenCircle.applyColor();
        greenSquare.applyColor();
    }
}
