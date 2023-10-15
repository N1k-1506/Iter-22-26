import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt(), sum = 0;
        int[] a = new int[5];
        System.out.print("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println("Sum of the numbers entered is:" + sum);
    }
}
