/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ellieearwood
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchData {
    public static void main(String[] args) {
        try {
            // Establish database connection
            Connection conn = DatabaseConnection.getConnection();
            if (conn == null) {
                System.out.println("Database connection failed.");
                return;
            }
            
            System.out.println("Connected to MySQL");
            System.out.println("Fetching Parking Spots...");
            
            // SQL query to fetch parking spots
            String query = "SELECT * FROM parking_spots";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            System.out.println("Parking Spots List:");
            System.out.println("---------------------------------");
            while (rs.next()) {
                int spotId = rs.getInt("spot_id");
                String spotNumber = rs.getString("spot_number");
                boolean isAvailable = rs.getBoolean("is_available");
                
                System.out.println("ID: " + spotId + " | Spot Number: " + spotNumber + 
                                   " | Availability: " + (isAvailable ? "Available" : "Taken"));
            }
            
            // Close resources
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


