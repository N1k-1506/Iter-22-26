
public class q04 {
	static String swap(String str,int i, int j){
		char a[]=str.toCharArray();
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;		
	}
	static String[] Permute(String[] str,int start,int end) {
		if(start==end) {
			return str;
		}			
		String newstr=swap(str[start],start+1,end);
		newstr=swap(str[start+1],start+1,end-1);
		return newstr;
		}
	public static void main(String args[]) {
		String[] a= {"c","a","r"};
		for(int i=0;i<a.length;i++) {
			String str=a[i];
				
				
	}
			
			
}
