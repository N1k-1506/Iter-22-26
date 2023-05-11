
public class hq04 {
    public static void main(String[] args) {
        PointType p1=new PointType();
        p1.setCoords(-1,-3);
        p1.display();
        PointType p2=new PointType();
        p2.setCoords(2, 7);
        p2.display();
        PointType ps=new PointType();
        ps=ps.add(p1, p2);
        ps.display();
        CircleType c1=new CircleType();
        c1.setCoords(2, 2);
        c1.getRadius(5,6);
        c1.printArea();
        c1.printCirc();

    }
}
class PointType{
    int x;
    int y;
    void setCoords(int n,int m){
        x=n;
        y=m;
    }
    void display(){
        System.out.println("Coordinates: ("+x+","+y+")");
    }
    public PointType add(PointType p1,PointType p2){
        PointType res=new PointType();
        res.x=p1.x+p2.x;
        res.y=p1.y+p2.y;
        return res;
    }
}
class CircleType{
    double r;
    PointType centre=new PointType();
    void setCoords(int x,int y){
        centre.x=x;
        centre.y=y;
    }
    public  void getRadius(int x,int y){
        PointType c=new PointType();
        c.x=x;
        c.y=y;
        double xc=(c.x-centre.x)*(c.x-centre.x);
        double yc=(c.y-centre.y)*(c.y-centre.y);
        r=Math.sqrt(xc+yc);
        System.out.println("Radius of the circle= "+r);

    }
    void printArea(){
        double area=Math.PI*r*r;
        System.out.println("Area of the circle="+area);
    }
    void printCirc(){
        double circ=2*Math.PI*r;
        System.out.println("Circumference of the circle= "+circ);
    }
    void moveleft(){
        centre.x=centre.x-1;
    }
    void moveRight(){
        centre.x=centre.x+1;
    }
    void moveUp(){
        centre.y=centre.y-1;
    }
    void moveDown(){
        centre.y=centre.y-1;
    }

}