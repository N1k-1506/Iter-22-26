
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        int x=fibonacci((n-2), 1, 1);
        System.out.println("The "+n+" term in fibonacci is "+x);
    }
    public static int fibonacci(int n,int a,int b) {
        if(n==0){
            return b;
        }
        int c=a+b;
        return fibonacci(n-1, b, c);
    }
}
