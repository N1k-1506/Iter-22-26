

public class q6 {
    public static void main(String[] args) {
        Demo <String> obj=new Demo();
        obj.x="abc";
        System.out.println(obj.x);
        System.out.println(obj.y);
        Demo <Integer> obj1=new Demo();
        obj1.x=11;
        System.out.println(obj1.x);
        System.out.println(obj1.y);
        Demo <Object> obj2=new Demo();
        obj2.x="Cde";
        obj2.y=12;
        System.out.println(obj2.x);
        System.out.println(obj2.y);


    }
}
class Demo <E>{
    E x;
    E y;
    Demo(){

    }
}