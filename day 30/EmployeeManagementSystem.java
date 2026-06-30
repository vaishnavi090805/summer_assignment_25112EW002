import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] empId = new int[100];
        String[] empName = new String[100];
        String[] empDepartment = new String[100];
        double[] empSalary = new double[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Department: ");
                    empDepartment[count] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    empSalary[count] = sc.nextDouble();

                    count++;
                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Employee Records Found.");
                    } else {
                        System.out.println("\n----- Employee Records -----");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Employee ID : " + empId[i]);
                            System.out.println("Name        : " + empName[i]);
                            System.out.println("Department  : " + empDepartment[i]);
                            System.out.println("Salary      : " + empSalary[i]);
                            System.out.println("----------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == searchId) {
                            System.out.println("Employee Found!");
                            System.out.println("Employee ID : " + empId[i]);
                            System.out.println("Name        : " + empName[i]);
                            System.out.println("Department  : " + empDepartment[i]);
                            System.out.println("Salary      : " + empSalary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found.");
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == updateId) {

                            System.out.print("Enter New Name: ");
                            empName[i] = sc.nextLine();

                            System.out.print("Enter New Department: ");
                            empDepartment[i] = sc.nextLine();

                            System.out.print("Enter New Salary: ");
                            empSalary[i] = sc.nextDouble();

                            System.out.println("Employee Record Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found.");
                    break;

                case 5:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == deleteId) {

                            for (int j = i; j < count - 1; j++) {
                                empId[j] = empId[j + 1];
                                empName[j] = empName[j + 1];
                                empDepartment[j] = empDepartment[j + 1];
                                empSalary[j] = empSalary[j + 1];
                            }

                            count--;
                            found = true;
                            System.out.println("Employee Deleted Successfully!");
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found.");
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