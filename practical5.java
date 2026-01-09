import java.util.Scanner;

class practical5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denominations = {100, 50, 10, 5, 2, 1};
        System.out.print("Enter the amount to be dispensed: ");
        int amount = scanner.nextInt();
            if (amount <= 0) {
            System.out.println("Error: Amount must be greater than 0");
            scanner.close();
            return;
        }
        System.out.println("\n---  Notes Required ---");
        calculateAndDisplayNotes(amount, denominations);
        scanner.close();
    }
    
    public static void calculateAndDisplayNotes(int amount, int[] denominations) {
        int remainingAmount = amount;
        int totalNotes = 0;
        
        for (int denomination : denominations) {
            int notesCount = remainingAmount / denomination;
            
            if (notesCount > 0) {
                System.out.printf("Notes of %d: %d\n", denomination, notesCount);
                totalNotes += notesCount;
            }
            
            remainingAmount = remainingAmount % denomination;
        }
        
        System.out.println("------------------------");
        System.out.printf("Total Notes Required: %d\n", totalNotes);
    }
}
