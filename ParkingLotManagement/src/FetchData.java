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
            // Get a connection to MySQL
            Connection conn = DatabaseConnection.getConnection();
            
            // Create a statement
            Statement stmt = conn.createStatement();
            
            // Execute SQL query
            String sql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(sql);
            
            // Process the result set
            System.out.println("📌 User List:");
            System.out.println("------------------------------");
            while (rs.next()) {
                int userId = rs.getInt("user_id");
                String username = rs.getString("username");
                String role = rs.getString("role");
                System.out.println("ID: " + userId + " | Username: " + username + " | Role: " + role);
            }
            
            // Close connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

