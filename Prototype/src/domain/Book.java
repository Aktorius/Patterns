package domain;

import abstracts.Item;

/**
 * Created by Aktorius on 24/04/2017.
 */
public class Book extends Item {

    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
