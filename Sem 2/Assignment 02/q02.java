/*Define a class called Complex with instance variables real, image and instance methods
setData(), display(), add().
 Write a Java program to add two complex numbers.
The prototype of add method is:
public Complex add(Complex, Complex).
*/
 
public class q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex A=new Complex();
		A.setData(4, 5);
		A.display();
		Complex B=new Complex();
		B.setData(10, 5);
		B.display();
		Complex C= new Complex();
		C=C.add(A, B);
		C.display();
		
			
		
	}

}
class Complex{
	int real,image;
	void setData(int a,int b) {
		this.real=a;
		this.image=b;
	}
	void display() {
		System.out.println("Complex no.: "+this.real+" +i"+this.image);
	}
	public Complex add(Complex a,Complex b) {
		Complex res=new Complex();
		res.real=a.real+b.real;
		res.image=a.image+b.image;
		return res;
	}
	
}
