import java.util.Scanner;

class practical4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double POUNDS_TO_KG = 0.45359237;
        final double INCHES_TO_METERS = 0.0254;
        System.out.print("Enter your weight in pounds: ");
        
        double weightPounds = scanner.nextDouble();
        System.out.print("Enter your height in inches: ");
        double heightInches = scanner.nextDouble();
        double weightKg = weightPounds * POUNDS_TO_KG;
        double heightMeters = heightInches * INCHES_TO_METERS;
        double bmi = weightKg / (heightMeters * heightMeters);
        System.out.println("\n--- BMI Calculation Results ---");
        System.out.printf("Weight: %.2f kg (%.2f lbs)\n", weightKg, weightPounds);
        System.out.printf("Height: %.2f meters (%.2f inches)\n", heightMeters, heightInches);
        System.out.printf("BMI: %.2f\n", bmi);
        
        displayBMICategory(bmi);
        scanner.close();
    }
    
    public static void displayBMICategory(double bmi) {
        System.out.print("Category: ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
