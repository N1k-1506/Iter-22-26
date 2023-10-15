import java.util.Scanner;
public class q04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        int i = 0, j = 0;
        int[] res = new int[2];
        int sum0 = Integer.MIN_VALUE,sum1;
        for (i = 0; i < n; i++) {
            sum1 = 0;
            for (j = i; j < n; j++) {
                sum1 += array[j];
                if (sum1 > sum0) {
                sum0 = sum1;
                res[0] = i;
                res[1] = j;
                }
            }
        }
        System.out.print("Largest Sum Contiguous Subarray: [ ");
        for (int a = res[0]; a < res[1] + 1; a++) {
            System.out.print(array[a] + ", ");
        }
        System.out.print("]");
    }
}