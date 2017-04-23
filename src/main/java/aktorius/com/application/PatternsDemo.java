package main.java.aktorius.com.application;

import services.InventorySystem;

/**
 * Created by Aktorius on 20/04/2017.
 */
public class PatternsDemo {

    public static void main (String[] args){
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("Bose Headphones", 221);
        inventorySystem.takeOrder("Samsung TV", 42);
        inventorySystem.takeOrder("Roomba", 332);
        inventorySystem.takeOrder("Bose Headphones", 231);
        inventorySystem.takeOrder("Samsung TV", 456);
        inventorySystem.takeOrder("Roomba", 337);
        inventorySystem.takeOrder("Bose Headphones", 211);
        inventorySystem.takeOrder("Samsung TV", 425);
        inventorySystem.takeOrder("Roomba", 3385);

        inventorySystem.process();

        System.out.println(inventorySystem.report());
    }
}
