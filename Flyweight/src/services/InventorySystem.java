package services;

import domain.Item;
import domain.Order;
import factory.Catalog;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class InventorySystem {

    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<Order>();

    public void takeOrder(String itemName, int orderNumber){
        Item item = catalog.lookup(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    public void process(){
        for (Order order : orders){
            order.processOrder();
            orders.remove(order);
        }
    }

    public String report(){
        return "\nTotal Item objects made: " + catalog.totalItemsMade();
    }
}
