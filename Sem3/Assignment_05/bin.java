public class bin {
        static int binarySearch(int arr[], int x) {
            int left = 0, right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == x)
                    return mid;
                if (arr[mid] < x)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            return -1;
        }
        public static void main(String args[]) {
            int arr[] = {2, 3, 4, 10, 40};
            int x = 10;
            if (binarySearch(arr, x) == -1)
                System.out.println("Element not present in array");
            else
                System.out.println("Element found at index " + binarySearch(arr, x));
        }   
}
