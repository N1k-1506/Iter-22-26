
import java.util.Scanner;
public class q3 extends MarksOutOfBoundException{
    public static void main(String[] args) throws MarksOutOfBoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the student ");
        String name=sc.nextLine();
        System.out.println("Enter marks: ");
        double marks=sc.nextDouble();   
        try {
            check(marks);
            System.out.println(name+" has got "+marks+" marks ");
        } catch (MarksOutOfBoundException e) {
            System.out.println(e);
        }
        

        
    }
}
    class MarksOutOfBoundException extends Exception{
        static void check(double n) throws MarksOutOfBoundException{
            if(n>100.0){
                throw new MarksOutOfBoundException();
            }
        }
        public String getMessage(){
            return "Marks can't be greater than 100";
        }

    }    
      
    
