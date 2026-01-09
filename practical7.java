import java.util.Scanner;

class practical7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of three sides of a triangle:");
        System.out.print("Side A: ");
        double sideA = scanner.nextDouble();
        System.out.print("Side B: ");
        double sideB = scanner.nextDouble();
        System.out.print("Side C: ");
        double sideC = scanner.nextDouble();
        
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("Error: All side lengths must be positive numbers");
            scanner.close();
            return;
        }
        if (!isValidTriangle(sideA, sideB, sideC)) {
            System.out.println("\nError: The given sides cannot form a valid triangle!");
            System.out.println("Reason: The sum of any two sides must be greater than the third side");
            System.out.printf("  %.2f + %.2f = %.2f which is not > %.2f\n", 
                sideA, sideB, sideA + sideB, sideC);
            scanner.close();
            return;
        }
        double area = calculateArea(sideA, sideB, sideC);
        System.out.println("\n--- Triangle Information ---");
        System.out.printf("Side A: %.2f\n", sideA);
        System.out.printf("Side B: %.2f\n", sideB);
        System.out.printf("Side C: %.2f\n", sideC);
        System.out.println("------------------------");
        System.out.printf("Area of Triangle: %.2f square units\n", area);
        
        scanner.close();
    }
    
    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }
    public static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        return area;
    }
}
