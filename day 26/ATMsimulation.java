import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int choice, amount;

        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Current Balance: ₹" + balance);

            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                amount = sc.nextInt();
                balance = balance + amount;
                System.out.println("Amount Deposited Successfully.");
                System.out.println("Updated Balance: ₹" + balance);

            } else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ");
                amount = sc.nextInt();

                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdrawal Successful.");
                    System.out.println("Remaining Balance: ₹" + balance);
                } else {
                    System.out.println("Insufficient Balance.");
                }

            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM.");
                break;

            } else {
                System.out.println("Invalid Choice. Please try again.");
            }
        }

        sc.close();
    }
}