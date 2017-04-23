package main.java.aktorius.com.application;

import domain.SimpleSandwich;
import interfaces.Sandwich;
import services.DressingDecorator;
import services.MeatDecorator;

/**
 * Created by Aktorius on 20/04/2017.
 */
public class PatternsDemo {

    public static void main (String[] args){
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
