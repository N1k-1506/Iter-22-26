package Assignment_03;

import java.util.Scanner;

public class bubble {
    static void bubbleSort(int[] arr) {
        int n = arr.length-1;
        int temp = 0;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < (n - i); j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
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
        bubbleSort(a);
        System.out.print("Sorted array ");
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }

}
