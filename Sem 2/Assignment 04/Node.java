import java.util.Scanner;
public class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    Node(int regd_no,float mark){
        this.regd_no=regd_no;
        this.mark=mark;
        next=null;
    }
    Node(int regd_no,float mark,Node next){
        this.regd_no=regd_no;
        this.mark=mark;
        this.next=next;
    }
    Node(){
        regd_no=0;
        mark=0.0f;
        next=null;
    }

    static Scanner in=new Scanner(System.in);
    public static boolean underflow(Node start){
        if(start==null){
            return true;
        }
        return false;
    }

    public static void create(Node start){  
        System.out.print("Enter no. of nodes: ");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter regd_no.");
            int x=in.nextInt();
            System.out.print("Enter marks ");
            float y=in.nextFloat();
            Node temp=new Node(x,y);
            if(underflow(start)){
                start=temp;
            }
            else{
                start.next=temp;
                start=temp;
            }  
        } 
    }

    public static Node InsBeg(Node start){
        System.out.println("Enter regd no.");
        int x=in.nextInt();
        System.out.println("Enter marks ");
        float y=in.nextFloat();
        Node temp=new Node(x,y);
        if(underflow(start)){
            start=temp;
            return start;
        }
        else{
            temp.next=start;
            start=temp;
            return start;
        }
        
    }

    public static Node InsEnd(Node start){
        System.out.println("Enter regd no.");
        int x=in.nextInt();
        System.out.println("Enter marks ");
        float y=in.nextFloat();
        Node temp=new Node(x,y);
        if(underflow(start)){
            start=temp;
            return start;
        }
        else{
            while(start.next!=null){
                start=start.next;
            }
            start.next=temp;
        }
        return temp;
    }

    public static Node InsAny(Node start){
        System.out.println("Enter the position ");
        int n=in.nextInt();
        System.out.println("Enter regd no.");
        int x=in.nextInt();
        System.out.println("Enter marks ");
        float y=in.nextFloat();
        Node temp=new Node(x,y);
        if(underflow(start)){
            start=temp;
            return temp;
        }
        for(int i=1;i<n-1;i++){
            start=start.next;
        }
        temp.next=start.next;
        start.next=temp;
        return temp;
    }

    public static Node DelBeg(Node start){
        if(underflow(start)){
            return null;
        }
        else{
            start=start.next;
            return start;
        }
    }

    public static Node DelEnd(Node start){
        if(underflow(start)){
            return null;
        }
        else{
        Node temp=start;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return temp;
        }
    }

    public static Node DelAny(Node start){
        System.out.println("Enter position: ");
        int n=in.nextInt();
        Node temp=start;
        for(int i=1;i<n-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return temp;
    }

    public static void DelRegdNo(int regd_no,Node start){
        if(underflow(start)){
            System.out.println("Empty list");
            return;
        }
        while(start.next!=null){
            if(start.regd_no==regd_no){
                start.next=start.next.next;
                return;
            }
            start=start.next;
        }
        System.out.println("Not found");

    }

    public static void search(Node start){
        System.out.println("Enter the regd_no. ");
        int x=in.nextInt();
        while(start.next!=null){
            if(start.regd_no==x){
                System.out.println("Enter the updated marks for "+ x+" : ");
                float y=in.nextFloat();
                start.mark=in.nextFloat();
                return;
            }
            start=start.next;
        }
        System.out.println(x+" not found"); 
    }
    
    public static void sort(Node start){
        if(underflow(start)){
            System.out.println("Empty list");
            return;
        }
        Node temp=start;
        while(temp.next!=null){
            Node temp2=temp.next;
            while(temp2.next!=null){
                if(temp2.mark>temp.mark){
                    float t=temp.mark;
                    int t1=temp.regd_no;
                    t1=temp.regd_no;
                    temp.regd_no=temp2.regd_no;
                    temp2.regd_no=t1;
                    temp.mark=temp2.mark;
                    temp2.mark=t;
                }
                temp2=temp2.next;
            }
           temp=temp.next;

        }
    }

    public static int count(Node start){
        if(underflow(start)){
            return 0;
        }
        int count=0;
        while(start.next!=null){
            count++;
            start=start.next;
        }
        return count+1;
    }

    public static Node reverse(Node start){
            Node prev = null;
            Node current = start;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
    }
    

    public static void display(Node start){
        if(underflow(start)){
            System.out.println("Empty list");
        }
        else{
            while(start.next!=null){
                System.out.println(start.regd_no+" "+start.mark);
                start=start.next;
            }
            System.out.println(start.regd_no+" "+start.mark);
        }
    }
}
