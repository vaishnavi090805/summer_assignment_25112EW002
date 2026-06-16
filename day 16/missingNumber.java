

public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};

        int n = 5; // Total numbers should be 1 to 5

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number = " + missingNumber);
    }
}