
import java.util.Scanner;

public class InventoryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] productName = new String[10];
        int[] quantity = new int[10];
        double[] price = new double[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < 10) {
                        sc.nextLine(); // Clear buffer

                        System.out.print("Enter Product Name: ");
                        productName[count] = sc.nextLine();

                        System.out.print("Enter Quantity: ");
                        quantity[count] = sc.nextInt();

                        System.out.print("Enter Price: ");
                        price[count] = sc.nextDouble();

                        count++;
                        System.out.println("Product Added Successfully!");
                    } else {
                        System.out.println("Inventory is Full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Products Available.");
                    } else {
                        System.out.println("\nProduct\t\tQuantity\tPrice");
                        for (int i = 0; i < count; i++) {
                            System.out.println(productName[i] + "\t\t" + quantity[i] + "\t\t" + price[i]);
                        }
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Product Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (productName[i].equalsIgnoreCase(search)) {
                            System.out.println("Product Found!");
                            System.out.println("Name: " + productName[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            System.out.println("Price: " + price[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product Not Found.");
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String update = sc.nextLine();

                    boolean updated = false;

                    for (int i = 0; i < count; i++) {
                        if (productName[i].equalsIgnoreCase(update)) {
                            System.out.print("Enter New Quantity: ");
                            quantity[i] = sc.nextInt();

                            System.out.println("Quantity Updated Successfully!");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Product Not Found.");
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