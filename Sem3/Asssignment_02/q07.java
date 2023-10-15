package Asssignment_02;

public class q07 {
    public static void main(String[] args) {
        System.out.println(power(3, 5));
    }
    static int power(int x,int n){
        if(n==0)
            return 1;
        if (n==1) 
            return x;
        return x*power(x, (n-1));
    }
}
