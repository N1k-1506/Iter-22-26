/*Define a class called Student with instance variables Roll, Name, DSA_Mark.

Also, the class consists of instance methods getdata( ), showdat( ) to provide input to the instance variable
and to display the value of instance variable.
Write a program to create the details of 5 students.
Display the information of the students who has secured the highest DSA_Mark.
public class q03 {
*/

import java.util.Scanner;
public class q03{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    Student[] students=new Student[2];
	    for(int i=0;i<students.length;i++){
	        students[i]=new Student();
	        System.out.println("\nEnter the details of "+(i+1)+" Student:");
	        students[i].getdata();
	    }
	    int max=students[0].DSA_Mark,highestscorer=0;
	    for(int i=1;i<students.length;i++){
	        if(students[i].DSA_Mark>max){
	            max=students[i].DSA_Mark;
	            highestscorer=i;
	        }
	    }
	    System.out.println("The Highest scorer in Dsa is:");
	    students[highestscorer].showData();
	   
	   }
	}
	class Student{
	    int Roll,DSA_Mark;
	    String Name;
	    public void getdata(){
	        Scanner sc=new Scanner (System.in);
	        System.out.println("Enter the roll no. ");
	        this.Roll=sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter the name of the student:");
	        this.Name=sc.nextLine();
	        System.out.println("Enter marks scored in DSA : ");
	        this.DSA_Mark=sc.nextInt();
	                       
	    }
	    public void showData(){
	        System.out.println("Roll: "+this.Roll+"\nName: "+this.Name+"\nDSA_Mark= "+this.DSA_Mark);
	    }
	
}
