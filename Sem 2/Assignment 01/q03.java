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
