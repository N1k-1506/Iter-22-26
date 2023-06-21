package Dsa_03;

public class q10 {
    public static void main(String[] args) {
        String s="pots&pans";
        int n=s.length()-1;
        String t="";
        System.out.println(Reverse(s, n, t));
    }
    public static String Reverse(String s,int n,String t) {
        if(n==-1){
            return t;
        }
        t=t+s.charAt(n);
        return Reverse(s, n-1, t);  
    }
}
