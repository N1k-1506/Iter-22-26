public class q07 {
   public static void main(String[] args) {    
    Employee H=new Employee("Javed chaurasia", 34, 191, 69000.0);
    H.empDisplay();
   }
}
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Employee extends Person{
    int eid;
    double salary;
    Employee(String name,int age,int eid,double salary){
        super(name,age);
        this.salary=salary;
        this.eid=eid;
    }
    void empDisplay(){
        System.out.println("Name: "+this.name+"\nAge: "+this.age+"\nEmployee ID: "+eid+"\nSalary:"+salary);
    }
}