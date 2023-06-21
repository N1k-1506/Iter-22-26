package Dsa_03;

public class haq2 {
    public static void main(String[] args) {
        int[]x={11,22,33,44,55};
        int y=search(x, 0, 44);
        if(y>=0){
            System.out.println("Position:"+(y+1));
        }
        else{
            System.out.println("Not found ");
        }
        
    }
 
    public static int search(int[] x,int i,int element){
        if(i==(x.length-1)){
            return -1;
        }
        if (element==x[i]) {
            return i;
        }
        return search(x, i+1, element);
    }
}
