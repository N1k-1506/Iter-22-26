//Finding first repeated element in an array.(Time complexity ,space,approach name to be mentioned in the assignment copy)
import java.util.HashMap;
public class q1 {
	public static void main(String[] args) {
		int[] array={1,2,3,4,5,8,4,3};
		int index=-1;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++) {
			int temp=array[i];
			if(hm.containsKey(temp)) {
				index=i;
				break;
			}
			hm.put(temp,1);
		}
		if(index==-1) {
			System.out.print("No repeated element found");
		}
		else {
			System.out.print("First repeated element found at "+(index+1)+" of value: "+array[index]);
		}
		
	}

}
