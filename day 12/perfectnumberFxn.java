import java.util.*;

public class perfectnumberFxn {
    static boolean isPerfect(int num){
int sum =0;
for (int i=1;i<num;i++){
if (num % i==0) {
   sum= sum+ i; 
}


}
return sum== num;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int num = sc.nextInt();

if (isPerfect(num)) {
    System.out.println(" perfect number");
}
else{ 
System.out.println(" not a prime number");

}
sc.close();
    }
}
