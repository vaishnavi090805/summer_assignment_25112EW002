
    public class PairSum {
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 5, 1, 3};
        int sum = 8;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair: " + arr[i] + " , " + arr[j]);
                }
            }
        }
    }
}

