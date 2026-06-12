
import java.util.*;
public class armstrongFxn {
  public static boolean isArmstrong(int num){
int original = num;
int sum =0;
while (num>0){
int digit = num % 10; 
sum = sum +(digit* digit*digit);
num= num/10;


}
return original == sum;

  }  
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int num = sc.nextInt();
if (isArmstrong(num)) {
    System.out.println("armstrong number");
}
else{
System.out.println("not an armstrong number");


}
sc.close();
}



}
