/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ellieearwood
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a new username:");
        String username = scanner.nextLine();
        
        System.out.println("Enter a password:");
        String password = scanner.nextLine();
        
        System.out.println("Enter role (driver/manager):");
        String role = scanner.nextLine();
        
        try {
            // Get connection to MySQL
            Connection conn = DatabaseConnection.getConnection();
            
            // SQL query to insert a new user
            String sql = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
            
            // Prepare the statement
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, role);
            
            // Execute the query
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("New user added successfully.");
            } else {
                System.out.println("Failed to add user.");
            }
            
            // Close connections
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

