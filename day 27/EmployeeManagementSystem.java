import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;
    double salary;
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n----- Employee Management System -----");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < 10) {
                        employees[count] = new Employee();

                        System.out.print("Enter Employee ID: ");
                        employees[count].id = sc.nextInt();

                        sc.nextLine(); // Clear input buffer

                        System.out.print("Enter Employee Name: ");
                        employees[count].name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        employees[count].department = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        employees[count].salary = sc.nextDouble();

                        count++;
                        System.out.println("Employee added successfully.");
                    } else {
                        System.out.println("Employee record is full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\nEmployee Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Employee ID : " + employees[i].id);
                            System.out.println("Name        : " + employees[i].name);
                            System.out.println("