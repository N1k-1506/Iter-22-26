//Find the missing no. in an array
import java.util.Arrays;
public class q3 {

	public static void main(String[] args) {
		int [] a= {2,5,3,6,1,8};
		Arrays.sort(a);
		int i=0;
		while(i<a.length) {
			if(a[i+1]==a[i]+1 || a[i+1]==a[i]) {
				i++;
			}
			else {
				System.out.print("Missing no. "+(a[i]+1));
				break;
			}
		}
	}

}
