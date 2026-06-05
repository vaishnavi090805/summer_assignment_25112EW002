//to check whether the number entered is strong or not
//number jiske digits ka factorial ka sum equal to number aata hai tb strong number hota hai

import java.util.Scanner;

public class STRONGNUM {
//program ka executeion main wle step se hota hai
//ye string wla line array hai of type string
public static void main(String args[]){

Scanner sc= new Scanner(System.in);
System.out.println("enter a number: ");
//input lene ke liye 
int num=sc.nextInt();
int original_num =num;
//sum variable ko initialise krdiya by 0
int sum=0;
//while loop use kekr condition check kiya
while(num>0){
    int digit = num%10;
int factorial =1;

//for loop use krke factorial find kiya 
for (int i=1; i<= digit ;i++){
factorial=factorial*i;
}
//factorial ko sum varible mai store krenge phir num ko 10 se divide krenge agr sum aur original number equal honge tb strong number hoga ni toh ni hoga
sum=sum+factorial;
num=num/10;

}
if (sum==original_num ) {
    System.out.println(original_num +"is strong number");
}
 else{

    System.out.println(original_num +"is not a strong number");
 }

sc.close();

}

}
