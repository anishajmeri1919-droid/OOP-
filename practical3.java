import java.util.Scanner;

public class practical3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single letter: ");
        char ch = scanner.next().charAt(0);

        if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The entered character is a vowel.");
            } else {
                System.out.println("The entered character is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a letter.");
        }

        scanner.close();
    }
}
