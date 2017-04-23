package main.java.aktorius.com.application;


import domain.Address;
import services.JdbcFacade;

import java.util.List;

/**
 * Created by Aktorius on 20/04/2017.
 */
public class PatternsDemo {

    public static void main (String[] args){
        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();

        System.out.println("Table Address created");

        jdbcFacade.insertIntoTable();

        System.out.println("Record inserted");

        List<Address> addresses = jdbcFacade.getAddresses();

        for (Address address : addresses){
            System.out.println(address);
        }
    }
}
