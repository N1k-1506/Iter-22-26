/*A phone number can be thought of as having three parts: the area code, the exchange code and
the number.

Example: A phone number, such as (212) 767-8900, can be thought of as having three parts:
the area code (212), the exchange (767) and the number (8900).

Define a class Phone to store these three parts of a phone number separately as instance
variable (area_code, exchange, number). The class consists of two member methods: input ( )
and display ( ).

Create two class objects of type phone. Initialize one directly (by using dot (.)
operator and instance variable with value area_code: 212, exchange: 767,
number: 8900), and initialize other from the user through member method input ( ).
Display both the numbers.*/

import java.util.Scanner;
public class q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your area_code,exchange,number:");
		int ar=input.nextInt(),ex=input.nextInt(),no=input.nextInt();
		Phone Your=new Phone();
		Your.input(ar,ex,no);
		Phone My=new Phone();
		My.input(212,767,8900);
		System.out.print("My ");
		My.display();
		System.out.print("Your ");
		Your.display();
		
		
		
	}
}
	class Phone{
		int area_code,exchange,number;
		void input(int ar,int ex, int no) {
			this.area_code=ar;
			this.exchange=ex;
			this.number=no;
		}
		void display() {
			System.out.println("Number:"+"("+this.area_code+") "+this.exchange +" "+this.number);
		}
	}


