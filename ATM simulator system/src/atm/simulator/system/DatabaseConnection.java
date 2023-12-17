package atm.simulator.system;

import java.sql.*;

public class DatabaseConnection {
    Connection c;
    Statement s;

    public DatabaseConnection() {
        try {
            // REGISTER THE DRIVER
            Class.forName("com.mysql.cj.jdbc.Driver");

            // CREATING THE CONNECTION
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Shiv@Mac13");

            // CREATING STATEMENT
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
