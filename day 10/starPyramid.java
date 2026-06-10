

public class starPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){   //outer loop
for(int j=1;j<=n-1;j++){   //pehla inner loop to print leading stars
System.out.print(" ");


}
for(int k=1;k<=(2*i-1);k++){     //stars ko print krne ke liye ye second inner loop use krenge
System.out.print("*");


}
System.out.println();     // cursor ko next line pe move krega

        }
    }
}
