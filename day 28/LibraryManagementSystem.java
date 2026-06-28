import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = new String[10];
        boolean[] issued = new boolean[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < books.length) {
                        System.out.print("Enter Book Name: ");
                        books[count] = sc.nextLine();
                        issued[count] = false;
                        count++;
                        System.out.println("Book Added Successfully!");
                    } else {
                        System.out.println("Library is Full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Books Available.");
                    } else {
                        System.out.println("\nAvailable Books:");
                        for (int i = 0; i < count; i++) {
                            System.out.print((i + 1) + ". " + books[i]);

                            if (issued[i]) {
                                System.out.println(" (Issued)");
                            } else {
                                System.out.println(" (Available)");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Number to Issue: ");
                    int issue = sc.nextInt();

                    if (issue >= 1 && issue <= count) {

                        if (!issued[issue - 1]) {
                            issued[issue - 1] = true;
                            System.out.println("Book Issued Successfully!");
                        } else {
                            System.out.println("Book is Already Issued.");
                        }

                    } else {
                        System.out.println("Invalid Book Number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book Number to Return: ");
                    int ret = sc.nextInt();

                    if (ret >= 1 && ret <= count) {

                        if (issued[ret - 1]) {
                            issued[ret - 1] = false;
                            System.out.println("Book Returned Successfully!");
                        } else {
                            System.out.println("Book was Not Issued.");
                        }

                    } else {
                        System.out.println("Invalid Book Number.");
                    }
                    break;

                case 5:
                    System.out.println("Thank You for Using Library Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}