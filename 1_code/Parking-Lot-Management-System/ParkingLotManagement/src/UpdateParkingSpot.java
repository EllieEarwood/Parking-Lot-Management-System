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


public class UpdateParkingSpot {
    public static void updateSpot(int spotId, boolean isAvailable) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "UPDATE parking_spots SET is_available = ? WHERE spot_id = ?";
            PreparedStatement psmt = conn.prepareStatement(sql);

            psmt.setBoolean(1, isAvailable);
            psmt.setInt(2, spotId);

            int rowsUpdated = psmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Parking spot updated successfully.");
            } else {
                System.out.println("No spot found with the given ID.");
            }

            psmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



