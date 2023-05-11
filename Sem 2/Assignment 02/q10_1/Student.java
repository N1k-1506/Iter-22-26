package q10_1;

public class Student {
	static int roll;
	static String name;
	protected static void input(String n, int r) {
		name=n;
		roll=r;
		
	}
	void output() {
		System.out.printf("Name: %s\nRoll number: %d",name,roll);
	}
	public static void main(String []args) {
		Student s1=new Student();
		s1.input("Hareesh", 22);
		s1.output();
	}

}
