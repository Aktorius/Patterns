package main.java.aktorius.com.services;

import main.java.aktorius.com.adapters.EmployeeAdapterCSV;
import main.java.aktorius.com.adapters.EmployeeAdapterLdap;
import main.java.aktorius.com.datasources.EmployeeCSV;
import main.java.aktorius.com.datasources.EmployeeDB;
import main.java.aktorius.com.datasources.EmployeeLdap;
import main.java.aktorius.com.interfaces.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aktorius on 20/04/2017.
 */
public class EmployeeServices {

    public List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList<Employee>();

        Employee employeeFromDb = new EmployeeDB("123", "Tarik", "Miri", "miri.tarik@gmail.com");

        employees.add(employeeFromDb);

        EmployeeLdap employeeFromLdap = new EmployeeLdap("chuck", "redhead", "Norris", "chucl@norris.com");

        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("231, Vam Damme, Jeam Claude, jc@vd.com");

        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;
    }
}
