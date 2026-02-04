<!-- BMI Calculator (Java Console App)
A simple command-line BMI (Body Mass Index) calculator written in Java. The application allows users to choose between Imperial or Metric units, enter weight and height values, calculate BMI, and display the BMI category.
Features
•	Supports Imperial and Metric BMI systems
•	Accepts user input from the console
•	Calculates BMI using standard formulas
•	Displays BMI category (Underweight, Normal, Overweight, Obese)
Project Structure
Main.java – Application entry point and program flow
UserInput.java – Handles user input and validation
BMICalculator.java – Performs BMI calculations and determines BMI category
Requirements
• Java Development Kit (JDK) 8 or higher
• Terminal or command prompt
• All source files located in the same directory
How to Compile and Run
Step 1: Place all files in one folder
Example:
bmi-app/
  Main.java
  UserInput.java
  BMICalculator.java
Step 2: Compile the program
javac Main.java UserInput.java BMICalculator.java
Step 3: Run the application
java Main
Example Usage
Imperial System Example
Input:
Imperial
180
70

Output:
Your BMI is: 25.82
Your BMI category is: Overweight
Metric System Example
Input:
Metric
82
1.78

Output:
Your BMI is: 25.88
Your BMI category is: Overweight
Notes
If an invalid BMI system is entered, the application will prompt the user to enter a valid system (Imperial or Metric). Ensure that all numeric inputs are valid numbers to avoid runtime errors. -->

