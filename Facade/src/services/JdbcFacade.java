package services;

import domain.Address;
import singleton.DbSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class JdbcFacade {

    DbSingleton instance = null;

    public JdbcFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTable(){
        int count = 0;
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("CREATE TABLE Address(ID INTEGER, StreetName VARCHAR(20), City VARCHAR (20))");
            statement.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable(){
        int count = 0;
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("INSERT INTO Address(ID, StreetName, City) VALUES (1, 'Quadrant Road', 'London')");
            statement.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddresses(){
        List<Address> addresses = new ArrayList<Address>();

        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");

            while (resultSet.next()){
                Address address = new Address(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
                addresses.add(address);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return addresses;
    }
}
