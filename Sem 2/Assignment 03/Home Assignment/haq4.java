public class haq4 {
    public static void main(String[] args) {
       int[] a={18,13,5,6,75,24,1,3};
       sort(a, a.length);
       for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
       }

    }
    public static void sort(int[] arr,int n){
        if(n==1)
            return;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        sort(arr,n-1);
    }
}
