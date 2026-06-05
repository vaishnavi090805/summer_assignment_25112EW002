//perfect number are the numbers jiska sum of divisors is equal to number


import java.util.*;
//public class created iske andr program run krega
public class Perfectnumber {
    //staic ki help se java mai bina object ke main run krega
    public static void main(String args[]){
//keyboard se provided input ko read kr skte hai
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
//take input
int num= sc.nextInt();
//sb divisors ka sum store krega
int sum=0;

//sab proper divisors ko add krne ke liye loop start krenge from 1 to num-1
for(int i=1;i<num;i++){
if (num%i==0){
sum=sum+i;


}
}
//to check whwther it is perfct number or not 
if (sum==num){
System.out.println(num+ "is a pereft number");}
else {

    System.out.println(num+"is not a perfect number");
}

sc.close();

}

    }

