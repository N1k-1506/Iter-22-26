import java.util.Scanner;
public class q07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int fact=1;
        for (int i = 2; i <=n;i++) {
            fact*=i;
        }
        System.out.println("Factorial of n: "+fact);
    }
}
