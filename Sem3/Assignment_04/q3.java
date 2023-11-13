import java.util.Scanner;
public class q3 {

    static void reverse(int[] a, int x, int y) {
        while (x < y) {
            int temp = a[x];
            a[x] = a[y];
            a[y] = temp;
            x++;
            y--;
        }
    }
    static boolean sortArr(int[] a, int n) {
        int x = -1;
        int y = -1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                if (x == -1) {
                    x = i;
                }
                y = i + 1;
            }
        }        
        if (x != -1) {
            reverse(a, x, y);
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        System.out.print("Enter array elements: ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            }
        if (sortArr(arr, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
