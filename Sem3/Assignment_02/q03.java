package Asssignment_02;
public class q03 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
}
