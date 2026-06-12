import java.util.*;

public class fibonacciFxn {
 public static void printfibonacci(int n) {
    int first =0;
    int second = 1;
for(int i =1;i<=n;i++){
System.out.println(first + " ");
int next = first + second ;
first = second;
second = next;
}
 }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("enter number of terms: ");
int n = sc.nextInt();
printfibonacci(n);
 
 
sc.close();

}
}