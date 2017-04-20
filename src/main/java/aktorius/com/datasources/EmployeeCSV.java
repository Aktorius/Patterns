package main.java.aktorius.com.datasources;

import java.util.StringTokenizer;

/**
 * Created by Aktorius on 20/04/2017.
 */
public class EmployeeCSV {

    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public EmployeeCSV(String values){
        StringTokenizer tokenizer = new StringTokenizer(values, ",");

        if(tokenizer.hasMoreElements())
            id = Integer.parseInt(tokenizer.nextToken());
        if (tokenizer.hasMoreElements())
            firstName = tokenizer.nextToken();
        if (tokenizer.hasMoreElements())
            lastName = tokenizer.nextToken();
        if (tokenizer.hasMoreElements())
            emailAddress = tokenizer.nextToken();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
