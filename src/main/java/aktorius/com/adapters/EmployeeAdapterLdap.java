package main.java.aktorius.com.adapters;

import main.java.aktorius.com.datasources.EmployeeLdap;
import main.java.aktorius.com.interfaces.Employee;

/**
 * Created by Aktorius on 20/04/2017.
 */
public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap employeeFromLdap) {
        instance = employeeFromLdap;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getSurname();
    }

    @Override
    public String getLastName() {
        return instance.getGivenName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
