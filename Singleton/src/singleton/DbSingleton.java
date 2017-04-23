package singleton;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class DbSingleton {

    private static DbSingleton instance = null;
    private Connection connection = null;

    private DbSingleton(){
        try{
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }

    public static DbSingleton getInstance(){
        if(instance == null) {
            synchronized (DbSingleton.class) {
                if(instance == null)
                    instance = new DbSingleton();
            }
        }
        return instance;
    }

    public Connection getConnection(){
        if(connection == null){
            synchronized (DbSingleton.class){
                if (connection == null){
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

                        connection = DriverManager.getConnection(dbUrl);
                    }catch (SQLException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }
}
