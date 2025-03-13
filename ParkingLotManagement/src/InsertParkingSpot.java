/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ellieearwood
 */import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertParkingSpot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the parking spot number:");
        String spotNumber = scanner.nextLine();

        System.out.println("Is the spot available? (true/false):");
        boolean isAvailable = scanner.nextBoolean();

        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "INSERT INTO parking_spots (spot_number, is_available) VALUES (?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, spotNumber);
            pstmt.setBoolean(2, isAvailable);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("New parking spot added successfully.");
            } else {
                System.out.println("Failed to add parking spot.");
            }

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

