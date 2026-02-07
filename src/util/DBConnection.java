package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(
                "jdbc:oracle:thin:@//localhost:1521/orcl",
                "system",
                "Tapiero123"
        );
    }
}   
