/*Define a class Deposit. The instance variable of the class Deposit are mentioned below.
Instance variable
Initialize the instance variables Principal, Time, rate through constructors. Constructors are
overloaded with the following prototypes.
Constructor1: Deposit ( )
Constructor2: Deposit (long, int, double)
Constructor3: Deposit (long, int)
Constructor4: Deposit (long, double)
Apart from constructor, the other instance methods are (i) display ( ): to display the
value of instance variables, (ii) calc_amt( ) to calculate the total amount.
Total_amt = Principal + (Principal×rate×Time)/100;*/

public class q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deposit P=new Deposit(120000,10,20);
		P.calc_Amount();
		P.display();
	}

}
class Deposit{
	long Principal;
	int time;
	double rate,Total_amount;
	Deposit(){
		
	}
	Deposit (long a, int b, double c){
		Principal=a;
		time=b;
		rate=c;
	}
	Deposit (long a, int b){
		Principal=a;
		time=b;
	}
	Deposit (long a, double c){
		Principal=a;
		rate=c;
	}
	double calc_Amount() {
		this.Total_amount=Principal+((Principal*rate*time)/100);
		return Total_amount;
	}
	void display() {
		System.out.println("Principal amount="+this.Principal+"\nTime= "+this.time+"\nRate of interest= "+this.rate+"\nTotal amount= "+this.Total_amount);
	}
	
}