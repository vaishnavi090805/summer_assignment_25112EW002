import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks;
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n----- Student Record Management -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < 10) {
                        students[count] = new Student();

                        System.out.print("Enter Roll Number: ");
                        students[count].rollNo = sc.nextInt();

                        sc.nextLine(); // Clear buffer

                        System.out.print("Enter Name: ");
                        students[count].name = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        students[count].marks = sc.nextInt();

                        count++;
                        System.out.println("Student record added successfully.");
                    } else {
                        System.out.println("Record is full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("\nStudent Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Roll No: " + students[i].rollNo);
                            System.out.println("Name: " + students[i].name);
                            System.out.println("Marks: " + students[i].marks);
                            System.out.println("-------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}