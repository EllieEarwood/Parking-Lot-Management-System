**Parking Lot Management System**
**Technologies Used**
- Apache NetBeans IDE
- MySQL Server 9.2.0
- MySQL Connector/J (JDBC driver)
- Git (optional)
**Setup Instructions**
1. Clone or Download the Repository
**If using Git:**
git clone https://github.com/YOUR_GITHUB_USERNAME/ParkingLotManagement.git  
cd ParkingLotManagement  
Or download the ZIP from GitHub and extract it.
**2. Import Project into NetBeans**
- Open NetBeans IDE.
- Click File > Open Project.
- Select the ParkingLotManagement folder.
- Click Open Project.
**3. Configure Database**
- Start your MySQL server.
- Open MySQL Workbench or Terminal and create the database:
  CREATE DATABASE parkinglotdb;  
USE parkinglotdb;  
**4. Import the Database Schema and Initial Data**
  mysql -u root -p parkinglotdb < parkinglotdb_backup.sql  
**5. Run the Project**
- In NetBeans, right-click on the project and select Run.
- Follow the menu options to interact with the parking lot system.
**  Features**
- View parking spots
- Add and delete reservations
- Update parking spot availability
- User authentication system (admin and driver roles)

Author: Ellie Earwood
Date: March 2025
