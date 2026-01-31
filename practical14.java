import java.util.Scanner;

class practical14 {
    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    static void search(practical14[] accounts, String searchId) {
        boolean found = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId.equals(searchId)) {
                System.out.println("Account Found:");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found!");
        }
    }

    public static void main(String[] args) {
        practical14[] accounts = new practical14[5];

        accounts[0] = new practical14();
        accounts[0].assignValues("ACC001", "Yug Sharma", 50000);

        accounts[1] = new practical14();
        accounts[1].assignValues("ACC002", "YuvrajSingh", 75000);

        accounts[2] = new practical14();
        accounts[2].assignValues("ACC003", "Anish Ajmeri", 100000);

        accounts[3] = new practical14();
        accounts[3].assignValues("ACC004", "Hardik Jain", 60000);

        accounts[4] = new practical14();
        accounts[4].assignValues("ACC005", "Noor ", 85000);

        System.out.println("All Accounts:");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayValues();
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account ID to search: ");
        String searchId = sc.nextLine();
        search(accounts, searchId);
    }
}
