# ATM Application

A simple ATM application developed in Java using Swing. This application allows users to perform basic banking operations such as withdrawing money, depositing money, and checking account balance.

## Features

- **Withdraw Amount**: Allows users to withdraw money from their account.
- **Deposit Amount**: Enables users to deposit money into their account.
- **Check Balance**: Displays the current account balance.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE such as IntelliJ IDEA or Eclipse

## Getting Started

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/atm-application.git
   ```

2. **Navigate to the Project Directory**
   ```bash
   cd atm-application
   ```

3. **Compile the Java Files**
   ```bash
   javac src/com/jframe_swing/*.java
   ```

4. **Run the Application**
   ```bash
   java -cp src com.jframe_swing.Atm
   ```

## Code Structure

- `src/com/jframe_swing/Atm.java`: Contains the main application logic and GUI.
- `src/com/jframe_swing/User.java`: Manages user information and account balance.

## Usage Instructions

- **Withdraw**: Enter the desired withdrawal amount in the input field and click "Withdraw Amount."
- **Deposit**: Enter the desired deposit amount in the input field and click "Deposit Amount."
- **Check Balance**: Click "Check Balance" to view the current account balance.

## Future Enhancements

- User authentication for secure access.
- Support for multiple user accounts.
- Enhanced user interface with additional features.

## Acknowledgments

- Java Swing for GUI components.
