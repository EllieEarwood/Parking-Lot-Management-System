**Parking Lot Management System**
**Technologies Used**
- Apache NetBeans IDE
- MySQL Server 9.2.0
- MySQL Connector/J
  
**Setup Instructions**
- Open NetBeans IDE.
- Click File > Open Project.
- Select the ParkingLotManagement folder.
- Click Open Project.
  
**Configure Database**
- Start your MySQL server.
- Open MySQL Workbench or Terminal and create the database:
  CREATE DATABASE parkinglotdb;  
USE parkinglotdb;

**Import the Database Schema and Initial Data**
  mysql -u root -p parkinglotdb < parkinglotdb_backup.sql 
  
**Run the Project**
- In NetBeans, right-click on the project and select Run.
- Follow the menu options to interact with the parking lot system.
  
**Features**
- View parking spots
- Add and delete reservations
- Update parking spot availability
- User authentication system (admin and driver roles)

Author: Ellie Earwood
Date: March 2025
