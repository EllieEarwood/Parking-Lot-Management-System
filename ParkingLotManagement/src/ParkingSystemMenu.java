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

            // Ensure that input is available before reading it
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Clear the newline character
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
                continue; // Restart loop
            }

            switch (choice) {
                case 1:
                    FetchData.main(new String[]{});
                    break;
                case 2:
                    InsertReservation.main(new String[]{});
                    break;
                case 3:
                    System.out.print("Enter the Parking Spot ID to update: ");
                    int spotId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    System.out.print("Is the spot available? (true/false): ");
                    boolean isAvailable = scanner.nextBoolean();
                    scanner.nextLine(); // Consume the newline

                    UpdateParkingSpot.updateSpot(spotId, isAvailable); // Directly call update method
                    break;
                case 4:
                    DeleteUser.main(new String[]{});
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 5);

        scanner.close(); // Close scanner when done
    }
}


