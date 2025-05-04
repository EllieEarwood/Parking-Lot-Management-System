Parking Lot Management System

Technologies Used

Apache NetBeans IDE
MySQL Server 9.2.0
MySQL Connector/J
Setup Instructions

Configure the Database

Start your MySQL Server.

Open MySQL Workbench or Command Line.

Create the database: CREATE DATABASE parkinglotdb; USE parkinglotdb;

Import the database schema and initial data:

mysql -u root -p parkinglotdb < parkinglotdb_backup.sql

Ensure parkinglotdb_backup.sql is in the same folder as MySQL or specify the full path
Open the Project in NetBeans

Open NetBeans IDE.
Click File > Open Project.
Select the ParkingLotManagement folder.
Click Open Project.
Run the Project

In NetBeans, right-click on the project and select Run.
Follow the menu options to interact with the Parking Lot Management System.
Features

View Parking Spots
Add and Delete Reservations
Update Parking Spot Availability
Author: Ellie Earwood Date: May 2025