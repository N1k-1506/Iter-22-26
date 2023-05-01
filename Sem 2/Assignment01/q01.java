/*Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.*/
import java.util.Scanner;
public class q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int x=sc.nextInt();
		int count=0;
		while(x>=2) {
			x=x/2;
			count++;
		}
		System.out.println("The no. of the no. must divide by 2:"+count);
	}

}
