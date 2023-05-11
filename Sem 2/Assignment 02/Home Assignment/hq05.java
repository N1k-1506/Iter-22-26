

public class hq05 {
    public static void main(String[] args) {
        RoomServiceMeal C1=new RoomServiceMeal();
        C1.display();
        double total=C1.price+C1.SFee;
        System.out.println("The total fee to pay is Rs."+total);
    }
}
interface RestrauntMeal{
    String name="Steak Dinner";
    double price=600;

}
interface HotelService{
    String Sname="Room Service";
    double SFee=24.00;
    int Room=1202;
}  
class RoomServiceMeal implements RestrauntMeal ,HotelService{
    public void display(){
        System.out.println("A \""+name+"\" costing Rs."+price+" is a \""+Sname+"\" provided to room "+Room+" for Rs"+SFee+" fee.");
    }
}