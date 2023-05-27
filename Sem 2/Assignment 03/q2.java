
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] array=new String[4];
        System.out.println("Enter four colours ");
        int i;
        for(i=0;i<4;i++){
            array[i]=sc.nextLine();
        }
        System.out.println("Convert String to integer ");
        try {
            Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e){ 
            System.out.println(e);
        }
        System.out.println("Enter one more colour");
        try{

            array[5]=sc.nextLine();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("The colours entered are:");
        for(int j=0;j<4;j++){
            System.out.println(array[j]);
        }
          
    }
    
}
