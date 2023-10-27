package Asssignment_02;
public class q04 {
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }
    static int fibo(int n){
        if(n<=1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
}
