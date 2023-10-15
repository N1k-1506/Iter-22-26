import java.util.*;
public class q03 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    System.out.print( "Enter the size of the array:");
    int n = sc . nextInt();
    int[] array= new int[n];
    System.out.print( "Enter the numbers : ");
    for(int i=0; i<n; i++){
        array[i] = sc.nextInt();
    }
    System.out.print("Enter the value of k:");
    int k = sc .nextInt();
    k = k % n;
    rotate(array, k);
    System. out . println ( "Array after rotation : "+(Arrays . toString(array)));
    }

    public static void rotate(int[] array, int k) {
        int len = array.length;
        reverse(array, 0, (len-k-1));
        reverse(array, (len-k), (len-1));
        reverse(array, 0, (len-1));
        
        
    }
    public static void reverse(int[] array, int start, int end) {
        int temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
