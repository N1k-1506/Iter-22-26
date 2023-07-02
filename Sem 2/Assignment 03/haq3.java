public class haq3 {
    public static void main(String[] args) {    
    String str="dre";
    if(checkpalindrome(str, 0, str.length()-1)){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not palindrome ");
    }
     
}
public static boolean checkpalindrome(String str,int start,int end){
    if(start==end)
        return true;
    if(str.charAt(start)!=str.charAt(end))
        return false;
    if(start<end+1)
        return checkpalindrome(str, start+1, end-1);    
    return true;
}
}
