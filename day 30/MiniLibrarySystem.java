
import java.util.Scanner;

public class MiniLibrarySystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] bookName = new String[100];
        String[] authorName = new String[100];
        boolean[] issued = new boolean[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== MINI LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book Name: ");
                    bookName[count] = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    authorName[count] = sc.nextLine();

                    issued[count] = false;
                    count++;

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Books Available.");
                    } else {
                        System.out.println("\n----- Book List -----");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Author    : " + authorName[i]);

                            if (issued[i])
                                System.out.println("Status    : Issued");
                            else
                                System.out.println("Status    : Available");

                            System.out.println("-------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookName[i].equalsIgnoreCase(search)) {
                            System.out.println("Book Found!");
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Author    : " + authorName[i]);

                            if (issued[i])
                                System.out.println("Status    : Issued");
                            else
                                System.out.println("Status    : Available");

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");
                    break;

                case 4:
                    System.out.print("Enter Book Name to Issue: ");
                    String issue = sc.nextLine();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookName[i].equalsIgnoreCase(issue)) {

                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book Issued Successfully!");
                            } else {
                                System.out.println("Book Already Issued.");
                            }

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");
                    break;

                case 5:
                    System.out.print("Enter Book Name to Return: ");
                    String ret = sc.nextLine();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookName[i].equalsIgnoreCase(ret)) {

                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book Returned Successfully!");
                            } else {
                                System.out.println("Book is Already Available.");
                            }

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}