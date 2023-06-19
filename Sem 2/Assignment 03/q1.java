package Dsa_03;
import java.util.Scanner;
public class q1 {

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your lucky number: ");
        int n=sc.nextInt();
        try{
            Check(n);
            System.out.println("Your lucky number is "+n);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }

    }
    static void Check(int n) throws NumberFormatException{
        if(n<0){
            throw new NumberFormatException("Negative number");
        }
    }
}