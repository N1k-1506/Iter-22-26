package Asssignment_02;
public class q01 {
    public static void main(String[] args) {
        int[] a={4,5,6,7,8,9};
        System.out.println(sum(a, 0)); 
    }
    static int sum(int[] a, int i){
        if(i>a.length-1){
            return 0;
        }
        return a[i]+sum(a, (i+1));
    }
}
