/*The body mass index (BMI) is commonly used by health and nutrition professionals to estimate
human body fat in populations. It is computed by taking the individual's weight (mass) in
kilograms and dividing it by the square of their height in meters.

Sample Run-1:
Enter person Weight in kg: 68
Enter height of person in meter: 2
The person is Underweight.*/

import java.util.Scanner;
public class q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weight in kg");
		double w=sc.nextDouble();
		System.out.println("Enter the height in meters");
		double h=sc.nextDouble();
		double bmi=w/(h*h);
		if(bmi<18.5) {
			System.out.println("Underweight");
		}
		else if(bmi>=18.5 && bmi<=24.9) {
			System.out.println("Normal weight");
		}
		else if(bmi>=25.0 && bmi<=29.9) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
	}

}
