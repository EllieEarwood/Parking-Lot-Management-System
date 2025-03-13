/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ellieearwood
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/ParkingLotDB"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = "082701"; 

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Connect to MySQL database
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to MySQL");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Failed. Check output console.");
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        // Test the connection
        getConnection();
    }
}
