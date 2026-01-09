class practical8 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CommandLineCalculator <number1> <number2>");
            System.out.println("Example: java CommandLineCalculator 10 20");
            System.exit(1);
        }
        
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println("\n--- Integer Calculation ---");
            System.out.printf("Number 1: %d\n", num1);
            System.out.printf("Number 2: %d\n", num2);
            System.out.println("------------------------");
            System.out.printf("Sum: %d + %d = %d\n", num1, num2, num1 + num2);
            System.out.printf("Product: %d × %d = %d\n", num1, num2, num1 * num2);
            System.out.printf("Difference: %d - %d = %d\n", num1, num2, num1 - num2);
            
            if (num2 != 0) {
                System.out.printf("Quotient: %d ÷ %d = %.2f\n", num1, num2, (double)num1 / num2);
                System.out.printf("Remainder: %d %% %d = %d\n", num1, num2, num1 % num2);
            } else {
                System.out.println("Quotient: Division by zero is not allowed");
                System.out.println("Remainder: Division by zero is not allowed");
            }
        } catch (NumberFormatException e) {
            try {
                double num1 = Double.parseDouble(args[0]);
                double num2 = Double.parseDouble(args[1]);
                System.out.println("\n--- Floating Point Calculation ---");
                System.out.printf("Number 1: %.4f\n", num1);
                System.out.printf("Number 2: %.4f\n", num2);
                System.out.println("------------------------");
                System.out.printf("Sum: %.4f + %.4f = %.4f\n", num1, num2, num1 + num2);
                System.out.printf("Product: %.4f × %.4f = %.4f\n", num1, num2, num1 * num2);
                System.out.printf("Difference: %.4f - %.4f = %.4f\n", num1, num2, num1 - num2);
                
                if (num2 != 0) {
                    System.out.printf("Quotient: %.4f ÷ %.4f = %.4f\n", num1, num2, num1 / num2);
                } else {
                    System.out.println("Quotient: Division by zero is not allowed");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Error: Arguments must be valid numbers (integers or decimals)");
                System.out.println("Example: java CommandLineCalculator 10.5 20.3");
                System.exit(1);
            }
        }
    }
}
