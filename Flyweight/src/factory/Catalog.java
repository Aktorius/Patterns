package factory;

import domain.Item;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aktorius on 23/04/2017.
 * Catalog acts as a Factory and cache for Items flyweights objects
 */
public class Catalog {
    private Map<String, Item> items = new HashMap<String, Item>();

    //factory method
    public Item lookup(String itemName){
        if(!items.containsKey(itemName))
            items.put(itemName, new Item(itemName));
        return items.get(itemName);
    }

    public int totalItemsMade(){
        return items.size();
    }
}
