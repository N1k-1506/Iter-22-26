// No. of distinct elements in an given array..


import java.util.Arrays;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("No. of distinct elements in given array: "+distinct(a));
    }

    static int distinct(int[] a){
        int b=0;
        Arrays.sort(a);
        for (int i = 0; i <a.length; i++) {
            while (i<a.length-1 && a[i]==a[i+1]) {
                i++;
            }
            b++;
        }
        return b;
    }
    
}

    
