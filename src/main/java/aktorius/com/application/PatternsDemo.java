package main.java.aktorius.com.application;

import abstracts.Printer;
import domain.*;
import interfaces.Formatter;
import services.MoviePrinter;
import services.PrintFormatter;

/**
 * Created by Aktorius on 20/04/2017.
 */
public class PatternsDemo {

    public static void main (String[] args){
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);

        System.out.println(printedMaterial);
    }
}
