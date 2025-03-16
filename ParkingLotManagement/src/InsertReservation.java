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
import java.sql.SQLException;

public class InsertReservation {
    public static void addReservation(int userId, int spotId) {
    try (Connection conn = DatabaseConnection.getConnection()) {
        // Insert into reservations
        String sql = "INSERT INTO reservations (user_id, spot_id) VALUES (?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, userId);
        pstmt.setInt(2, spotId);

        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("New reservation added successfully.");

            // Update parking spot availability
            String updateSql = "UPDATE parking_spots SET is_available = FALSE WHERE spot_id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setInt(1, spotId);
            updateStmt.executeUpdate();
            updateStmt.close();
        } else {
            System.out.println("Failed to add reservation.");
        }

        pstmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}


