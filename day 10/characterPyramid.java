

public class characterPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
System.out.print(" ");
for(int space =1;space<=n-i;space++){
System.out.print(" ");



}
char ch='A';
for(int j=1;j<=i;j++){

System.out.print(ch);
ch++;
}
ch-= 2;
for(int k=1;k<i;k++){
    System.out.print(ch);
    ch--;
}
System.out.println();
        }
    }
}
