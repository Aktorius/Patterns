package domain;

import interfaces.Sandwich;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "Simple Sandwich";
    }
}
