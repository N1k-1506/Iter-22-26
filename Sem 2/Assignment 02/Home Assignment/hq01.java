
import java.util.Scanner;
public class Hq01 {
    
}
class Commission{
    double sales;
    Commission(double sales){
        this.sales=sales;
    }
    public void getCommission(){
        double Commission;
        if(sales<100){
            Commission=0.02*sales;
        }
        else if(sales>=100 && sales<500){
            Commission=0.03*sales;
        }
        else if(sales>=500 && sales<5000){
            Commission=0.05*sales;
        }
        else{
            Commission=0.08*sales;
        }
        System.out.println("Commission="+Commission);
        
    }
}
class Demo{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount of sales:");
    double sales=sc.nextDouble();
    if(sales<0){
        System.out.println("Invalid Input");
    }
    else{
        Commission c1=new Commission(sales);
        c1.getCommission();
    }
    }
}