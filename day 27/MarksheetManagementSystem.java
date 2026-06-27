
import java.util.Scanner;

public class MarksheetManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int rollNo;
        int m1, m2, m3, m4, m5;
        int total;
        double percentage;
        char grade;

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        m3 = sc.nextInt();

        System.out.print("Enter Marks of Subject 4: ");
        m4 = sc.nextInt();

        System.out.print("Enter Marks of Subject 5: ");
        m5 = sc.nextInt();

        total = m1 + m2 + m3 + m4 + m5;
        percentage = total /