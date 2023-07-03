package Dsa_03;

public class haq2 {
    public static void main(String[] args) {
        int[]x={11,22,33,44,55};
        int y=search(x, 0,x.length,11);
        if(y>=0){
            System.out.println("Position:"+(y+1));
        }
        else{
            System.out.println("Not found ");
        }
        
    }
 
    public static int search(int[] a,int s,int l,int element){
        if(l>=1 && s<a.length){
            int mid=(s+l)/2;
            if(a[mid]==element){
                return mid;
            }
            if(a[mid]>element){
                return search(a, s, mid, element);
            }
            if(a[mid]<element){
                return search(a, mid+1, l, element);
            }
            if(s==l){
                return -1;
            }
        }
        return -1;
    }
}
