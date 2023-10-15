package Asssignment_02;
import java.util.Arrays;
public class q08 {
    public static void main(String[] args) {
       int[] a={-8,3,-4,0,2,1,-1};
        Arrays.sort(a); 
        int[] temp=positive(a, 0, 0);
    }
    static int[] positive(int[] a,int i,int j){
        int[] temp=new int[a.length];
        if(i==(a.length-1))
            return temp;
        if(a[i]>0){
            temp[j]=a[i];
            j=j+1;
        }
        positive(a, (i+1), j);
        return temp;
    }
}
