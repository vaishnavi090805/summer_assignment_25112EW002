import java.util.*;

public class countbit {
      
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("enter a number: ");
int num = sc.nextInt();
int count =0;
while (num>0) {
    if(num%2==1){
count++;


    }
num=num/2;
}
System.out.println("number of set bits="+count);

sc.close();
}
}
