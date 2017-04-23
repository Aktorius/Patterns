package services;

import abstracts.Printer;
import domain.Detail;
import domain.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class MoviePrinter extends Printer {

    private Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Year", movie.getYear()));
        details.add(new Detail("Runtime", movie.getRuntime()));

        return details;
    }

    @Override
    protected String getHeder() {
        return movie.getClassification();
    }
}
