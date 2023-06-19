package Dsa_03;
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. you want to reverse: ");
        int n=sc.nextInt();
        System.out.print(n+" reverse of this no. is: ");
        Reverse(n);
    }
    public static void Reverse(int n) {
        if(n<=0){
            return;
        }
        int temp=n%10;
        System.out.print(temp);
        Reverse(n/10);
    }
    
}
