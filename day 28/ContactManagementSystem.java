import java.util.Scanner;

public class ContactManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        String[] phoneNumbers = new String[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===============================");
            System.out.println("   CONTACT MANAGEMENT SYSTEM");
            System.out.println("===============================");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < names.length) {
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();

                        System.out.print("Enter Phone Number: ");
                        phoneNumbers[count] = sc.nextLine();

                        count++;
                        System.out.println("Contact Added Successfully!");
                    } else {
                        System.out.println("Contact List is Full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Contacts Found.");
                    } else {
                        System.out.println("\n------ Contact List ------");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + names[i]
                                    + " - " + phoneNumbers[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(search)) {
                            System.out.println("Name : " + names[i]);
                            System.out.println("Phone: " + phoneNumbers[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Name to Delete: ");
                    String delete = sc.nextLine();
                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(delete)) {

                            for (int j = i; j < count - 1; j++) {
                                names[j] = names[j + 1];
                                phoneNumbers[j] = phoneNumbers[j + 1];
                            }

                            count--;
                            deleted = true;
                            System.out.println("Contact Deleted Successfully!");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Contact Not Found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}