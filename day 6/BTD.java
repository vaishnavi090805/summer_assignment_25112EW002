import java.util.*;

public class BTD {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("enter a binary number");
int binary = sc.nextInt();
int decimal=0;
int power=0;
while (binary>0) {
    int digit = binary
%10;
decimal=decimal + digit+ (int)Math.pow(2,power);
power++;
binary=binary/10;


}
System.out.println("Decimal Number="+decimal);
sc.close();

}
    
}
