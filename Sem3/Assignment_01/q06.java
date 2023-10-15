import java.util.Arrays;
import java.util.Scanner;

public class q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        int [] temp=minmax(array);
        System.out.println("Minmax array: ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }

    }
    static int[] minmax(int[] a){
        boolean flag=true;
        int start=0,end=a.length-1;
        int[] temp=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (flag) {
                temp[i]=a[start];
                start++;
            }
            else{
                temp[i]=a[end];
                end--;
            }
            flag=!flag;
        }
        return temp;
    }
}
