package Dsa_03;
import java.util.Scanner;
public class haq1 extends InvalidBalanceException {


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Bank b1=new Bank("Vikash", 1234, 500);
    try {
        int withdraw=b1.balance-sc.nextInt();
        check(withdraw);
        System.out.println("Balance after withdraw "+withdraw);
    } catch (InvalidBalanceException e) {
        System.out.println(e);
    }
}

    
}
class Bank{
    int acc_no,balance;
    String name;
    Bank(String name,int acc_no,int balance){
        this.name=name;
        this.acc_no=acc_no;
        this.balance=balance;
    }

}
class InvalidBalanceException extends Exception{
    static void check(int n) throws InvalidBalanceException{
        if(n<=100){
            throw new InvalidBalanceException();
        }
    }
    public String getMessage(){
        return"Balance cannot be less than 0";
    }

}