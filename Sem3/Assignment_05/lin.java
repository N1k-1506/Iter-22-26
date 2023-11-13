public class lin{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7,result=-1;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==target) {
                result=i;
            }
        }
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

