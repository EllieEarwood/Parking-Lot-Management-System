/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ellieearwood
 */
import java.util.Scanner;

public class ParkingSystemMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\nPARKING LOT MANAGEMENT SYSTEM");
            System.out.println("1 - View Parking Spots");
            System.out.println("2 - Add a Reservation");
            System.out.println("3 - Update Parking Spot Availability");
            System.out.println("4 - Delete a Reservation");
            System.out.println("5 - Exit");
            System.out.print("Choose an option: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        FetchData.main(new String[]{});
                        break;

                    case 2:
                        System.out.print("Enter User ID: ");
                        int userId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        System.out.print("Enter Parking Spot ID: ");
                        int spotId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        InsertReservation.addReservation(userId, spotId); // Call method directly
                        System.out.println("Reservation added. Returning to menu...");
                        break;

                    case 3:
                        System.out.print("Enter the Parking Spot ID to update: ");
                        int spotIdToUpdate = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        System.out.print("Is the spot available? (true/false): ");
                        boolean isAvailable = scanner.nextBoolean();
                        scanner.nextLine(); // Consume newline

                        UpdateParkingSpot.updateSpot(spotIdToUpdate, isAvailable);
                        break;

                    case 4:
    System.out.print("Enter Reservation ID to delete: ");
    int reservationId = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    DeleteUser.deleteReservation(reservationId); // Ensure correct class name
    break;


                    case 5:
                        System.out.println("Exiting the system...");
                        break;

                    default:
                        System.out.println("Invalid choice! Please select a valid option.");
                        break;
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // Consume invalid input
            }

        } while (choice != 5);

        scanner.close(); // Close scanner when done
    }
}


