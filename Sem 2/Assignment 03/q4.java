package Dsa_03;
import java.util.Scanner;
public class q4 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Integer[] a={1,4,7,5,8};
    Double[] b={2.3,1.2,4.5};
    printArray(a);
    printArray(b);
    
   }
   public static <E> void printArray(E [] inputArray){
    for(int i=0;i<inputArray.length;i++){
            System.out.print(inputArray[i]+" ");
        }
        System.out.println();
   } 
}
