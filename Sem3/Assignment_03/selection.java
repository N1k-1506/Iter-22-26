package Assignment_03;
import java.util.Scanner;
public class selection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int [] a=new int[sc.nextInt()];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        selectionSort(a);
        System.out.print("Sorted array ");
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }

    static void selectionSort(int[] a){
        int n=a.length;
        for (int i = 0; i <n-1; i++) {
            int smallest=i;
            for (int j = i+1; j<n; j++) {
                if (a[smallest]>a[j]) {
                    smallest=j;
                }
            }
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;
        }
    }
}
