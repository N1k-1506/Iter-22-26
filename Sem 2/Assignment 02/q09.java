
public class q09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam[] ms=new Exam[1];
		System.out.println("Reuslt of first student:");
		ms[0]=new Exam();
		ms[0].inputStudent("Jagdish", 56, "CSE");
		ms[0].inputMarks(67, 80, 56);
		ms[0].displayStudent();
		ms[0].displayResult();
		
	}

}
class Student01{
		int roll;
		String name,course;
		void inputStudent(String n,int r,String c){
			name=n;
			roll=r;
			course=c;
		}
		void displayStudent() {
			System.out.println("Name: "+name+"\nRoll number: "+roll+"\nCourse: "+course);
		}
}
class Exam extends Student01{
	int mark1,mark2,mark3;
	void inputMarks(int m1,int m2,int m3) {
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	void displayResult() {
		System.out.println("Result of the student:\nMarks of Subject1= "+mark1+"\nMarks of Subject2= "+mark2+"\nMarks of Subject3= "+mark3);
	}
}