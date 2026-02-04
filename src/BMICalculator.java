public class BMICalculator {

    // Declare the following four attributes/properties in the BMICalculator class to represent: weight in pounds, height in inches, weight in kilos, and height in meters
    // -------------------------------------------------
    private double weightInPounds;
    private double heightInInches;
    private double weightInKilos;
    private double heightInMeters;


    // A no-argument constructor that initializes the four properties to some initial values
    // -------------------------------------------------
    // No-argument constructor
    public BMICalculator() {
        this.weightInPounds = 0.0;
        this.heightInInches = 0.0;
        this.weightInKilos = 0.0;
        this.heightInMeters = 0.0;
    }

    // Utility classes
    // -------------------------------------------------------

    // Imperial Calculation Method
    // ------------------------------------------------
    public double calculateBmiImperial(double weightInPounds, double heightInInches) {
        return (703 * weightInPounds) / (heightInInches * heightInInches);
    }

    // Metric Calculation Method
    // -------------------------------------------------
    public double calculateBmiMetric(double weightInKilograms, double heightInMeters) {
        return weightInKilograms / (heightInMeters * heightInMeters);
    }
    
    // getBMICategory Method
    // Pass the getBMICategory method, which takes in the BMI value and returns the BMI category based on the following parameters:-----------------------------------------------
    public String getBMICategory(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal weight";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}

