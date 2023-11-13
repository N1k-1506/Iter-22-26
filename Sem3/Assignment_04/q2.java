import java.util.Arrays;
import java.util.Scanner;

public class q2 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements of 1 & 2 array:");
        int n=sc.nextInt(),n2=sc.nextInt();
        System.out.print("Enter array elements of 1st array: ");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            }
        System.out.print("Enter array elements of 2nd array: ");
        int b[]=new int[n2];
        for(int j=0;j<b.length;j++){
            b[j]=sc.nextInt();
        }
    // int[] a = {1, 3, 5, 7};
    // int[] b = {2, 4, 6, 7, 8};
    int[] c = new int[a.length + b.length];

    merge(a, b, c);

    System.out.println(Arrays.toString(c));
}

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
    
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
    
        while (i < a.length) {
            c[k++] = a[i++];
        }
    
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}
