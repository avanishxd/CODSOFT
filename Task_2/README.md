# Student Grade Calculator

This project is a simple **Student Grade Calculator** implemented in Java. It calculates the total marks, percentage, and grade based on marks inputted for five subjects: English, Maths, Science, History, and Geography.

## Features
- Accepts marks for 5 subjects (out of 100).
- Calculates total marks.
- Calculates percentage based on total marks.
- Determines grade based on the percentage.

## Grading System
The grade is calculated as follows:
- **A**: 90% and above
- **B**: 80% - 89%
- **C**: 70% - 79%
- **D**: 60% - 69%
- **F**: Below 60%

## How to Run the Program

1. Clone or download the repository from GitHub.
2. Open the project in your Java IDE or compile it using the terminal/command prompt.
3. Run the `Grade_test.java` file, which serves as the entry point for the program.
4. Enter the marks for each subject when prompted, and the program will display:
   - Marks obtained for each subject.
   - Total marks out of 500.
   - Percentage.
   - Grade.

## Code Structure

The project consists of two main classes:

### `Grade.java`
- **Attributes**: 
  - Stores the marks for the five subjects.
  - Computes the total marks and percentage.
  - Assigns a grade based on the percentage.
  
- **Methods**:
  - `input()`: Accepts input marks for each subject.
  - `marks()`: Computes the total marks.
  - `perc()`: Computes the percentage based on total marks.
  - `grd()`: Assigns a grade based on the percentage.
  - `result()`: Displays the marks, total marks, percentage, and grade.

### `Grade_test.java`
- **Main Class**: It runs the application by creating an instance of the `Grade` class and calling its `input()` method to begin the process.

## Example Output

Student Grade Calculator Enter Student Marks out of 100: English: 85 Maths: 90 Science: 88 History: 75 Geography: 80

Student Details: Marks Obtained: English: 85 Maths: 90 Science: 88 History: 75 Geography: 80

Total Marks Obtained: 418/500 Percentage: 83.60% Grade: B


## Requirements
- Java Development Kit (JDK) 8 or above.
- A Java-compatible IDE or terminal with Java installed.

## Contact

For any questions or further information, feel free to reach out:

- **Email**: avanishmore25@gmail.com
