import java.util.Scanner;

class practical6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit integer: ");
        String input = scanner.nextLine().trim();
            if (input.length() != 5 || !input.matches("\\d{5}")) {
            System.out.println("Error: Please enter exactly 5 digits");
            scanner.close();
            return;
        }
        int[] digits = new int[5];
        for (int i = 0; i < 5; i++) {
            digits[i] = Character.getNumericValue(input.charAt(i));
        }
        int carry = 0;
        for (int i = 4; i >= 0; i--) {
            int sum = digits[i] + 1 + carry;
            if (sum == 10) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = sum;
                carry = 0;
            }
        }
        System.out.println("\n--- Result ---");
        System.out.print("Input Number:  ");
        System.out.println(input);
        
        System.out.print("Output Number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();
        scanner.close();
    }
}
