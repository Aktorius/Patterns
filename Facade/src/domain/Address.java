package domain;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class Address {
    private int id;
    private String streetName;
    private String city;

    public Address(int id, String streetName, String city) {
        this.id = id;
        this.streetName = streetName;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString(){
        return id +" "+ streetName +" "+ city;
    }
}
