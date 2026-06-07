//given 1st=0 and 2nd=1
//kaam krna h to create next term c=a+b

public class recursivefibo {
  public static void fibonacci(int a,int b,int n){
if (n==0) {
    return;
}
int c=a+b;
System.out.println(c);
fibonacci(b,c, n-1); 
} // kyuki c hmne already likha hai
public static void main(String args[]){

int a=0;
int b=1;
int n=15;
fibonacci(a,b,n-2);  //yha n-2 hai kyuki do variable already likhi hui hai

}
  
}
