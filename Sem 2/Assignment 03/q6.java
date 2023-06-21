package Dsa_03;

public class q6 {
    public static void main(String[] args) {
        Box<String> ob1=new Box<String>("Hello");
		Box<String> ob2=ob1;
		ob2.display();
		
		Box<Integer> ob3=new Box<Integer>(10);
		Box<Integer> ob4=ob3;
		ob4.display();
		
		Box<Object> ob5=new Box<Object>(100);
		ob5.display();
		
		Box<Object> ob6=new Box<Object>("Good Morning");
		ob6.display();
	}

}
  
class Box<T>
{
	T a;

	public Box(T a) {
		this.a = a;
	}
	
	void display()
	{
		System.out.println("A= "+a);
	}
	
}
