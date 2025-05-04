Parking Lot Management System
InsertReservation.java

Description:
This Java class adds a new reservation record to the `reservations` table and updates the availability status of the selected parking spot.

It is used to populate test reservation data programmatically.

How to Run:

1. Ensure the `DatabaseConnection` class is working and points to the correct database.
2. Open NetBeans and include InsertReservation.java in your project.
3. Call the method with example values:
   InsertReservation.addReservation(1, 3);

This will:
- Insert a reservation for user ID 1 and spot ID 3
- Mark spot ID 3 as unavailable in the `parking_spots` table

Database must be running and connected via MySQL.
