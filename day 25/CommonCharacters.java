
public class CommonCharacters {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        System.out.print("Common Characters: ");

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if (str2.indexOf(ch) != -1) {
                System.out.print(ch + " ");
            }
        }
    }
}