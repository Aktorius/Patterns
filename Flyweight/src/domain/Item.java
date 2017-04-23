package domain;

/**
 * Created by Aktorius on 23/04/2017.
 * Instances of the Item class will be the flyweights
 */
public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
