import java.util.Scanner;

public class q02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int num[]=new int[n];
        System.out.print("Enter the numbers: ");
        for(int i =0;i<n;i++){
            num[i]=sc.nextInt();   
            max=Math.max(max,num[i]);
            min=Math.min(min,num[i]);
        }
        System.out.println("Maximum Number : "+max+" Minimum Number: "+min);

    }
}
