package domain;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class Order {

    private final int orderNumber;
    private final Item item;

    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    public void processOrder(){
        System.out.println("Ordering " +item+ " for order "+orderNumber);
    }
}
