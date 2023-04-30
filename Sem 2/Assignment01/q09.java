import java.util.Scanner;
public class q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double[][] a= new double[4][4];
		System.out.println("Enter the elements of the 2D array:");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=sc.nextDouble();
			}
		}
		System.out.println("Sum="+sumMajorDiagonal(a));

	}
	public static double sumMajorDiagonal(double[][]m) {
		double sum=0.0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
					sum+=m[i][j];
				}
				
			}
		}
		return sum;

	
	}

}
