/*Write a java program to check whether a number is a spy number or not.

Example:
N = 132
Sum of digit of N = 1 + 3 + 2 = 6
Product of digit of N = 1 × 3 × 2 = 6
So, 132 is a spy number.

Sample Run:
Enter a number: 1124
1124 is a spy number.*/

import java.util.Scanner;
public class q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int x=sc.nextInt();
		int t=x;
		int n=0,sum=0,product=1;
		while(x>0) {
			n=x%10;
			sum+=n;
			product*=n;
			x=x/10;
		}
		if(sum==product) {
			System.out.println(t+" is a spy number.");
		}else {
			System.out.println(t+" is not a spy number.");
		}
	}

}
