package q10_1;
import q10_2.*;
public class Test extends Student implements Sports{
	public int mark1,mark2;
	public void input(String n,int r,int m1,int m2){
		Student.input(n,r);
		mark1=m1;
		mark2=m2;
		
	}
	public void output(){
		Student student = new Student();
		student.output();
		System.out.printf("\nMarks in first subject: %d\nMarks in second subject: %d\nScore 1: %d\nScore 2: %d",mark1,mark2,Score1,Score2);
	}
	public static void main(String[] args) {
		Test t1=new Test();
		t1.input("Hareesh", 22, 24, 25);
		t1.output();
	}

}
