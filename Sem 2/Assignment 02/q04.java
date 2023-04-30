/*Define a class called product. Two instance variables of the class are pid (product-id) and
price (product price). It consists of one static variable tot_price (total price). Initialize the value
of instance variables through parameterized constructor. It consists of a display ( ) method to
display the value of instance variables. A person went to market and purchase 5 different
products. Using the above mentioned class, display the details of products that the person has
purchased. Also, determine how much total amount the person will pay for the purchase of 5
products.*/
import java.util.Scanner;
public class q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Product[] products=new Product[5];
		products[0]=new Product("QWERTY91",189);
		products[1]=new Product("QWERTY92",197);
		products[2]=new Product("QWERTY93",143);
		products[3]=new Product("QWERTY94",675);
		products[4]=new Product("QWERTY95",90);
		for(int i=0;i<5;i++) {
			products[i].display();
			products[i].tot_price+=products[i].price;
		}
		System.out.println("The total price of the products= "+products[4].tot_price);
		
	}

}
class Product{
	String pid;
	int price;
	static int tot_price=0;
	Product(String x,int n){
		this.pid=x;
		this.price=n;
	}
	void display() {
		System.out.println("Product id: "+this.pid+"\nPrice: "+this.price);
	}
}
