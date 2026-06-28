
import java.util.Scanner;

public class BankAccountSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String accountHolder;
        int accountNumber;
        double balance;
        int choice;
        double amount;

        System.out.println("=================================");
        System.out.println("     BANK ACCOUNT SYSTEM");
        System.out.println("=================================");

        // Create Account
        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ₹");
        balance = sc.nextDouble();

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Deposit Amount: ₹");
                    amount = sc.nextDouble();

                    if (amount > 0) {
                        balance += amount;
                        System.out.println("₹" + amount + " Deposited Successfully!");
                    } else {
                        System.out.println("Invalid Amount!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Withdrawal Amount: ₹");
                    amount = sc.nextDouble();

                    if (amount <= balance && amount > 0) {
                        balance -= amount;
                        System.out.println("₹" + amount + " Withdrawn Successfully!");
                    } else {
                        System.out.println("Insufficient Balance or Invalid Amount!");
                    }
                    break;

                case 3:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 4:
                    System.out.println("\n----- ACCOUNT DETAILS -----");
                    System.out.println("Account Holder : " + accountHolder);
                    System.out.println("Account Number : " + accountNumber);
                    System.out.println("Balance        : ₹" + balance);
                    break;

                case 5:
                    System.out.println("Thank You for Using Our Bank System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}