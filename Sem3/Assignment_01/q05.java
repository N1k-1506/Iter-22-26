import java.util.Scanner;

public class q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System. out . print("Enter the size of the array: ") ;
        int n = sc.nextInt();
        int[] array= new int[n];
        System. out . print("Enter the numbers: ");
        for(int i=0; i<n; i++)
            array[i] = sc.nextInt();
        boolean reg[] = new boolean[n+1];
        for(int i : array)
            if(i<n && i>0)
            reg[i]=true;
        int res = 1;
        while((res<reg.length) && (reg[res]))
            res++;
        System.out.println("Smallest missing positive number is: " + res);
    }

}
