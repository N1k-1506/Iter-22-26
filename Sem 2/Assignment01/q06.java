package DSA_01;
import java.util.Scanner;
public class q06 {
    public static void main(String[] args) {
        int number;
        Scanner in= new Scanner(System.in);
     
        System.out.println("Enter a number to check even or odd");
        number=in.nextInt();
        System.out.println(isOdd(number));
    }
    public static boolean isOdd(int number){
        boolean cond=true;
        if((number & 1)==0){
            cond=false;
        }else{
            cond =true;
        }
        return cond;
     
        
    }

}
