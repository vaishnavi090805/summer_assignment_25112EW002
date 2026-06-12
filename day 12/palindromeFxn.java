
import java.util.*;

public class palindromeFxn {
  public static boolean isPalindrome(int num){

int original = num;
int reverse =0;
while(num>0){
    int digit = num%10;
    reverse = reverse *10 + digit;
    num = num/10;
}
return original == reverse;

  } 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int num = sc.nextInt();
if (isPalindrome(num)) {
    System.out.println("palindrome function");
}
else{
System.out.println("not a palindrome function");

}
sc.close();
}





}
