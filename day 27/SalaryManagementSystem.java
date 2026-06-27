import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basicSalary, hra, da, netSalary;
}

public class SalaryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.id = sc.nextInt();

        sc.nextLine(); // Clear buffer

        System.out.print("Enter Employee Name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        emp.basicSalary = sc.nextDouble();

        // Salary Calculation
        emp.hra = emp.basicSalary * 0.20; // 20% HRA
        emp.da = emp.basicSalary * 0.10;  // 10% DA
        emp.netSalary = emp.basicSalary + emp.hra + emp.da;

        // Display
        System.out.println("\n----- Salary Details -----");
        System.out.println("Employee ID   : " + emp.id);
        System.out.println("Employee Name : " + emp.name);
        System.out.println("Basic Salary  : " + emp.basicSalary);
        System.out.println("HRA (20%)     : " + emp.hra);
        System.out.println("DA (10%)      : " + emp.da);
        System.out.println("Net Salary    : " + emp.netSalary);

        sc.close();
    }
}