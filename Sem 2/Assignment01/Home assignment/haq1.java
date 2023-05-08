import java.util.Scanner;
public class haq1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if((a+b)==c || a ==(b-c) || (a*b)==c){
            System.out.println("Correct Arithmetic Formula");
        }
        else{
            System.out.println("Not Correct Arithmetic formula");
        }

    }

}
