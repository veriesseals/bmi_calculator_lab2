public class BMICalculator {

    // Declare the following four attributes/properties in the BMICalculator class to represent: weight in pounds, height in inches, weight in kilos, and height in meters
    // -------------------------------------------------
    private double weightInPounds;
    private double heightInInches;
    private double weightInKilos;
    private double heightInMeters;


    // A no-argument constructor that initializes the four properties to some initial values
    // -------------------------------------------------

    // Utility classes
    // -------------------------------------------------------

    // Imperial Calculation Method
    // ------------------------------------------------
    public double calculateBmiImperial(double weightInPounds, double heightInInches) {
        return weightInPounds / (heightInInches * heightInInches) * 703;
    }

    // Metric Calculation Method
    // -------------------------------------------------
    public double calculateBmiMetric(double weightInKilograms, double heightInMeters) {
        return weightInKilograms / (heightInMeters * heightInMeters);
    }




}
