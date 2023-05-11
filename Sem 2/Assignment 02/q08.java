
public class q08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PERSON p1=new PERSON("Abhinash Mishra");
		p1.count();
		p1.display();
	}

}
interface DetailInfo{
	void display();
	int count();
}
class PERSON implements DetailInfo{
	String name;
	static int maxcount=0;
	PERSON(String n){
		name=n;
	}

	public int count() {
		char[] ch=name.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				maxcount++;
			}
		}
		return maxcount;
	}
	public void display() {
		System.out.println("Name: "+name+"\nNo. of characters in the name:"+maxcount);
	}
}
