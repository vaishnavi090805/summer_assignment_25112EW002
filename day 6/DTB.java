import java.util.*;

public class DTB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
int num = sc.nextInt();
String binary =" ";

while(num>0){

int remainder =num %2;
binary=remainder+binary;
num=num/2;


}
System.out.println("binary number =" +binary);
sc.close();
    }









}
