import java.util.Scanner;
public class q08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Person p1= new Person();
        System.out.println("Enter the name:");
        String n1=sc.nextLine();
        p1.name=n1;
        p1.count();
        p1.display();
    }
}
interface DetailInfo{
    void display();
    void count();
}
class Person implements DetailInfo{
    static int maxcount;
    String name;
    public void count(){
        char[] n=name.toCharArray();
        for(int i=0;i<n.length;i++){
            if(n[i]!=' '){
                maxcount++;
            }
        }
    }
    public void display(){
        System.out.println("Name : "+this.name+"\nCount="+maxcount);
    } 

}
