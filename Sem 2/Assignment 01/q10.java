import java.util.Scanner;
public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double[][]a=new double[3][4];
		System.out.println("Enter the elements of the 2D array:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=sc.nextDouble();
			}
		}
		System.out.println("Enter the column index:");
		int n=sc.nextInt();
		System.out.println("Sum of the given column= "+sumColumn(a,n));
		
	}
	public static double sumColumn(double[][]m,int columnIndex) {
		double sum=0.0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				if(j==columnIndex) {
					sum+=m[i][j];
				}
			}
		}
		return sum;
	}

}
