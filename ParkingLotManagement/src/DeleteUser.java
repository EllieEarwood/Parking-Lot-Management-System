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

public class DeleteUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter User ID to delete:");
        int userId = scanner.nextInt();

        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "DELETE FROM users WHERE user_id = ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userId);

            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("User deleted successfully");
            } else {
                System.out.println("No user found with that ID.");
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

