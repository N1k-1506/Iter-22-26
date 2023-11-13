public class linrecur {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = linearSearch(array, target, 0);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    static int linearSearch(int[] array, int target, int index) {
        if (index < array.length) {
            if (array[index] == target) {
                return index;
            } else {         
                return linearSearch(array, target, index + 1);
            }
        }
        return -1;
    }  
}
