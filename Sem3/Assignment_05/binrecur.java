public class binrecur {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = binarySearch(sortedArray, target, 0, sortedArray.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    static int binarySearch(int[] array, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid; 
            } else if (array[mid] < target) {
                return binarySearch(array, target, mid + 1, high);
            } else {
                return binarySearch(array, target, low, mid - 1);
            }
        }
        return -1; 
    }
}
