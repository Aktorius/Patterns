package services;

import adapters.EmployeeAdapterCSV;
import datasources.EmployeeCSV;
import datasources.EmployeeDB;
import datasources.EmployeeLdap;
import adapters.EmployeeAdapterLdap;
import interfaces.Employee;

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
