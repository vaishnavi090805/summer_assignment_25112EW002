
public class SortByLength {
    public static void main(String[] args) {
        String[] names = {"Vaishnavi", "Ankit", "Priya", "Rahul", "Aman"};

        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].length() > names[j + 1].length()) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("Strings sorted by length:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}