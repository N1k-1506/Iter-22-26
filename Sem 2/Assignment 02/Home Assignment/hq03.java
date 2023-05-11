

public class hq03 {
    public static void main(String[] args) {
        Distance d1=new Distance(100, 8);
        d1.display();
        Distance d2=new Distance(79, 31);
        d2.display();
        Distance res=new Distance(0, 0);
        res=res.sum(d1, d2);
        res.display();


    }
}
class Distance{
    int meters,centimeters;
    Distance(int m,int cm){
        meters=m;
        centimeters=cm;
    }
    void display(){
        System.out.println("Distance: "+meters+"m "+centimeters+"cm");
    }
    public Distance sum(Distance a,Distance b){
        Distance res=new Distance(meters, centimeters);
        res.meters=a.meters+b.meters;
        res.centimeters=a.centimeters+b.centimeters;
        return res;
    }
}
