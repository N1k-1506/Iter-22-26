
import java.util.Scanner;
public class q4 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter elements of an array ");
    Integer[] a=new Integer[5];
    for (int i = 0; i < a.length; i++) {
        a[i]=sc.nextInt();
    }
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
