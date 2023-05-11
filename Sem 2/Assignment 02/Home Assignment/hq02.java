

public class hq02 {
    public static void main(String[] args) {
        Book[] books=new Book[5];
        books[0]=new Book("Graph theory","2nd",749);
        books[1]=new Book("Data Structures and Algorithms","6th",699);
        books[2]=new Book("Calculus","7th",829);
        books[3]=new Book("Physics","13th",999);
        books[4]=new Book("Economics","3rd",529);
        System.out.println("Details of the costliest book:");
        int max=books[0].BPrice,maxcost=0;
        for(int i=0;i<5;i++){
            if(max<books[i].BPrice){
                max=books[i].BPrice;
                maxcost=i;
            }
        }
        books[maxcost].display();

    }
}
class Book{
    String BName,BEdition;
    int BPrice;
    Book(String BName,String BEdition,int BPrice){
        this.BName=BName;
        this.BEdition=BEdition;
        this.BPrice=BPrice;
    }
    void display(){
        System.out.println("Name of the book: "+BName+"\nBook Edition: "+BEdition+"\nPrice of the book: "+BPrice);
    }

}
