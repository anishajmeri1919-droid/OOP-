import java.util.Scanner;

public class practical2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficients for the system of equations:");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        System.out.print("Enter d: ");
        double d = scanner.nextDouble();
        System.out.print("Enter e: ");
        double e = scanner.nextDouble();
        System.out.print("Enter f: ");
        double f = scanner.nextDouble();

        double D = a * d - b * c;
        if (D == 0) {
            System.out.println("Error: The determinant D is zero. No unique solution exists.");
        } else {
            double Dx = e * d - b * f;
            double Dy = a * f - c * e;
            double x = Dx / D;
            double y = Dy / D;
            System.out.println("The solution is:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        scanner.close();
    }
}