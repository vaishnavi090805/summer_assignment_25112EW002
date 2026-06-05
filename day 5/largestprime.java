
import java.util.*;
public class largestprime {
    public static void main(String args[]){
}
Scanner sc=new Scanner(System.in);
System.out.println("enter a number: ");
int n=sc.nextInt();
int largestprime = 2;

for(int num=2; num<=n; num++){
boolean isPrime= true;
for (int i=2;i<num;i++){
    if (num%i==0){
        isPrime= false;
        break;
    }
}
if (isPrime) {
largestprime=num;
}
}
System.out.println("largest primenumber =" + largestprime );
sc.close();
}
}