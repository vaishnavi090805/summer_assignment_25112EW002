

public class recursivereverse {
    public static int reverse(int number,int reversedtotal){
//base case: if the remaining number is zero then return zero
if (number==0) {
    return reversedtotal;
}
//extract last digit of a number
int lastdigit = number%10;
//shift the total to left and add the last digit 
reversedtotal=(reversedtotal*10)+lastdigit;

    }
public static void main(String[] args) {
    int inputnumber = 12345;
    int result  = reverse(inputnumber,0);  //call the method ,initialising the reversed total at 0
    System.out.println("original number");
    System.out.println("reversed number");
}



}

