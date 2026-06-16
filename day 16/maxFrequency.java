
    public class maxFrequency {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 2, 5, 1};

        int maxFreq = 0;
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Element with Maximum Frequency: " + maxElement);
        System.out.println("Frequency: " + maxFreq);
    }
}

