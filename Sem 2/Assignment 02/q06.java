import java.util.Scanner;
public class q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the shape: \n1: Square \n2: Triangle\n3: Circle");
		int x=sc.nextInt();
		switch(x) {
			case 1:
				System.out.println("Enter the side of the square:");
				int n=sc.nextInt();
				Square sq=new Square();
				sq.area(n);
				break;
			case 2:
				System.out.println("Enter length and breadth of triangle:");
				double l=sc.nextDouble();
				double b=sc.nextDouble();
				Triangle t=new Triangle();
				t.area(l,b);
				break;
			case 3:
				System.out.println("Enter the radius of the circle:");
				double r=sc.nextDouble();
				Circle c=new Circle();
				c.area(r);
				break;
		}

		
	}

}
abstract class Shape{
	abstract void area(int n);
	abstract void area(double l,double b);
	abstract void area(double r);
}
class Square extends Shape{
	public void area(int n) {
		int Area=n*n;
		System.out.println("Area of square= "+Area);
	}
	public void area(double n) {
	}
	public void area(double l, double b) {
	}
	
}
class Circle extends Shape{
	public void area(double r) {
		double area=Math.PI*r*r;
		System.out.println("Area of Circle= "+area);
	}
	public void area(int n) {
		
	}
	public void area(double l,double b) {
		
	}
}
class Triangle extends Shape{
	public void area(double r) {
	}
	public void area(int n){
	} 
	public void area(double l,double b) {
		double area=0.5*(l*b);
		System.out.println("Area of triangle= "+area);
	}
}