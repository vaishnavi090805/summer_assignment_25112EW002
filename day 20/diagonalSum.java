
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        int sum = 0;

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Sum of principal diagonal elements
        for (int i = 0; i < 3; i++) {
            sum = sum + matrix[i][i];
        }

        System.out.println("Sum of diagonal elements = " + sum);

        sc.close();
    }
}