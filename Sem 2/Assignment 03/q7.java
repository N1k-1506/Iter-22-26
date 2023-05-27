

public class q7 {
    public static void main(String[] args) {
        int a=factorial(4);
        System.out.println(a); 
        int b=power(5,4);
        System.out.println(b);
        int y=gcd(56,84 );
        System.out.println(y);
        int n=180;
        DecToBinary(n);
        int c=7;
        int d=36;
        System.out.println(Product(c, d));
    }
    

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        return x*power(x,(n-1));
    }
    public static int gcd(int a,int b){
       if(b!=0){
        return gcd(b,a%b);
       }
       else{
        return a;
       }
    
    }
    public static void DecToBinary(int n) {
        if(n==0){
            return;
        }
        DecToBinary(n/2);
        int r=n%2;
        System.out.print(r+" ");
    }
    public static int Product(int a,int b){
        if(a==0 || b==0){
            return 0;
        }
        return a+Product(a, b-1);
    }
        
        
}


