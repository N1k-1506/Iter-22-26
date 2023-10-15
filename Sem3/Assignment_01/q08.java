import java.util.Scanner;

public class q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int f0 = 0, f1 = 1;
        int temp;
        for (int i = 1; i < n - 1; i++) {
            temp = f1;
            f1 = f0 + f1;
            f0 = temp;     
        }
        System.out.println("nth Fibonacci Number : " + f1);
    }
}
