package main.java.aktorius.com.application;

import main.java.aktorius.com.services.EmployeeServices;

/**
 * Created by Aktorius on 20/04/2017.
 */
public class AdapterDemo {

    public static void main (String[] args){
        EmployeeServices service = new EmployeeServices();

        System.out.println(service.getEmployeeList());
    }
}
