package main.java.aktorius.com.adapters;

import main.java.aktorius.com.datasources.EmployeeCSV;
import main.java.aktorius.com.interfaces.Employee;

/**
 * Created by Aktorius on 20/04/2017.
 */
public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV employeeCSV) {
        instance = employeeCSV;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
}
