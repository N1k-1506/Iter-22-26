package Asssignment_02;
public class q05 {
    public static void main(String[] args) {
        int a=gcd(999,126);
        System.out.println(a);
    }
    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b, a%b);    
    }
}
