package Assignment_03;
import java.util.Scanner;
public class insertion {
    static void insertionsort(int [] a){
        for (int i = 1; i <a.length; i++) {
           int current=a[i];
           int j=i-1;
           while(j>=0 && current<a[j]){
                a[j+1]=a[j];
                j--;
           }
           a[j+1]=current;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int [] a=new int[sc.nextInt()];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        insertionsort(a);
        System.out.print("Sorted array ");
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }

    }
}
