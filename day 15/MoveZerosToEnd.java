
    import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int temp[] = new int[n];
        int index = 0;

        // Copy non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Remaining positions automatically contain 0

        System.out.println("Array after moving zeros to end:");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
