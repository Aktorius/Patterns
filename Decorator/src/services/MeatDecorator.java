package services;

import abstracts.SandwichDecorator;
import interfaces.Sandwich;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return customSandwich.make() + addMeat();
    }

    private String addMeat(){
        return " + turkey";
    }
}
