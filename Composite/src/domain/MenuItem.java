package domain;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class MenuItem extends MenuComponent {
    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
