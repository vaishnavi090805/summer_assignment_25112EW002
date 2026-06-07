
//sbse pehle ek recursive fxn bnaynge 
public class recursivefact {
    public static int Calcfactorial(int n){  // yha kwl n ka kaam hai isiliye kwl n liye hai 
//aur yha calcfactorial ek function hai
if(n==1||n==0){  //ye hmara base case hai
    return 1;
}
int factnm1 = Calcfactorial(n-1);
int fact_n=n*factnm1;
return fact_n;
    }
public static void main(String[] args) {
    int n=8;
    int ans = Calcfactorial(n);  //calcfactorial ki value ko ans variable mai store krenge
    System.out.println(ans);  //phir ans ko print kr denge
}

}
