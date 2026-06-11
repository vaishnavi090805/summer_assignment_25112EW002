
import java.util.*;
public class factorialFxn {
    public static void printfactorial(int n){  
int factorial=1;
for(int i=n;i>=1;i--){
factorial=factorial*i;


}
 
System.out.println(factorial);
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
printfactorial(N);

    }
}
