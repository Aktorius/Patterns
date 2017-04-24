package services;

import abstracts.Item;
import domain.Book;
import domain.Movie;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by Aktorius on 24/04/2017.
 */
public class Registry {

    private Map<String, Item> items = new HashMap<String, Item>();
    
    public Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;

        try {
            item = (Item)(items.get(type)).clone();
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Pulp Fiction");
        movie.setPrice(25.94);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Harry Potter");
        book.setNumberOfPages(675);
        book.setPrice(10.20);
        items.put("Book", book);
    }
}
