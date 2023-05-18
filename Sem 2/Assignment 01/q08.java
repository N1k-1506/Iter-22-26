import java.util.Scanner;
public class q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of rows and columns");
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		int[][] a= new int[rows][columns];
		System.out.println("Enter the elements of the 2D array:");
		int sum=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				a[i][j]=sc.nextInt();
				sum+=a[i][j];
				
			}
		}
		System.out.println("Sum= "+sum);
		System.out.println("Array in tabular form:");
		for(int i=0;i<columns;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

}
