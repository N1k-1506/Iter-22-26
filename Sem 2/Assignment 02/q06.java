import java.util.Scanner;
public class q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the shape: \n1: Square \n2: Circle\n3: Triangle");
		int x=sc.nextInt();
		switch(x) {
			case 1:
				System.out.println("Enter the side of the square:");
				int n=sc.nextInt();
				Square sq=new Square(n);
				sq.area();
				break;
			case 2:
				System.out.println("Enter the radius of the circle:");
				double r=sc.nextDouble();
				Circle c=new Circle(r);
				c.area();
				break;
			case 3:
				System.out.println("Enter the length and breadth of the Triangle:");
				double l=sc.nextDouble(),b=sc.nextDouble();
				Triangle t=new Triangle(l,b);
				t.area();
				break;
		}
		
	}

}
abstract class Shape{
	abstract void area();
}
class Square extends Shape{
	int n;
	Square(int n){
		this.n=n;
	}
	public void area() {
		int Area=n*n;
		System.out.println("Area of the square= "+Area);
	}

}
class Circle extends Shape{
	double r;
	Circle(double r){
		this.r=r;
	}
	public void area() {
		double area=Math.PI*r*r;
		System.out.println("Area of the Circle= "+area);
	}

}
class Triangle extends Shape{
	double b,h;
	Triangle(double b,double h){
		this.b=b;
		this.h=h;
	}
	void area() {
		double area=0.5*b*h;
		System.out.println("Area of the Triangle= "+area);
	}
	
}
