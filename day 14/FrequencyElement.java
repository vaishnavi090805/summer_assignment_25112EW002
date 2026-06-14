
    import java.util.Scanner;

public class FrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 2, 4, 2, 5};

        System.out.print("Enter element to find frequency: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        System.out.println("Frequency of " + num + " = " + count);

        sc.close();
    }
}
