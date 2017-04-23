package services;

import abstracts.SandwichDecorator;
import interfaces.Sandwich;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return customSandwich + addDressing();
    }

    private String addDressing(){
        return " + mustard";
    }
}
