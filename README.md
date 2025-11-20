Defense System – Java OOP Project (Observer Pattern)

A complete defense-unit simulation system developed using Java and NetBeans IDE.
This project demonstrates communication between multiple defense units (Helicopter, Tank, Submarine) and a Main Control Unit using the Observer Design Pattern. Each unit has its own GUI and behavior, creating a fully interactive simulation.

🚀 Project Features
🛰️ Main Control Unit

Central monitoring and control panel

Broadcast messages to all units

Send private messages to an individual unit

Collect information from all defense units

Updates system-wide strength

Handles area-clear status and message communication

🚁 Helicopter Unit

GUI for aerial operations

Shoot, missile, and laser actions

Position control

Sends strength and status updates to Main Controller

Receives and displays messages

🚜 Tank Unit

Ground combat operations

Shoot, missile, radar, and rotate-shoot controls

Soldier and ammo counters

Sends area and strength information

Displays messages from Main Controller

🚢 Submarine Unit

Underwater operations

Torpedo/missile firing, sonar activation

Custom underwater actions

Sends strength, status, and message updates

Receives broadcast and private messages

⚙️ Technologies Used

Java

NetBeans IDE

Java Swing GUI

Observer Design Pattern

Interfaces & Inheritance

Enums (Strength levels)

📁 How the System Works

The system starts by creating all defense units and the Main Controller.

Each unit registers itself as an observable to the controller.

User actions (shoot, update sliders, send messages, etc.) trigger updates.

The Main Controller receives updates and broadcasts messages or strength signals back.

All units update their GUI in real time based on controller communication.

🖼️ User Interface

The project includes fully styled JFrame windows with background images for:

Main Control Unit

Helicopter

Tank

Submarine

Each window displays live message updates and operational actions.

📥 Project Repository

The full project (97MB) is uploaded to GitHub:

👉 GitHub Link:
git clone https://github.com/nishans9665/Defence-System-in-the-Java-Project-Using-Observable-with-Interface.git

📌 How to Run

Clone the repository

Open the project in NetBeans IDE

Clean & Build the project

Run the Starter or MainController class (based on your setup)
