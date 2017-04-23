package main.java.aktorius.com.application;


import services.EmployeeServices;

/**
 * Created by Aktorius on 20/04/2017.
 */
public class PatternsDemo {

    public static void main (String[] args){
        EmployeeServices service = new EmployeeServices();

        System.out.println(service.getEmployeeList());
    }
}
