package Asssignment_02;

public class q06 {
   public static void main(String[] args) {
        hexadecimal(1213);
   }
   static char[] a={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
   static void hexadecimal(int n){
        if (n==0) {
            return;
        }
        int x=n%16;
        hexadecimal(n/16);
        System.out.print(a[x]);
   } 
}
