
public class q07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1=new Employee("Puneet",34,732,68000);
		System.out.println("Details of Employee:");
		E1.empDisplay();
	}

}
class Person{
	String name;
	int age;
	Person(String n,int x){
		name=n;
		age=x;
	}
	
}
class Employee extends Person{
	int eid;
	double salary;
	Employee(String n,int x,int id,double s){
		super(n,x);
		eid=id;
		salary=s;
	}
	void empDisplay() {
		System.out.println("\nName: "+this.name+"\nAge: "+this.age+"\nEmployee id: "+this.eid+"\nSalary: "+this.salary);
	}
}