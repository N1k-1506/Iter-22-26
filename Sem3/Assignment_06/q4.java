//Given an array of integers,find the element pair with minimum/maximum difference.
import java.util.Arrays;

public class q4 {

    public static void findMinMaxDifferencePair(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array should contain at least two elements.");
            return;
        }
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        int minPairIndex = 0;
        int maxPairIndex = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int currentDiff = arr[i + 1] - arr[i];
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                minPairIndex = i;
            }
            if (currentDiff > maxDiff) {
                maxDiff = currentDiff;
                maxPairIndex = i;
            }
        }
        System.out.println("Pair with minimum difference: (" + arr[minPairIndex] + ", " + arr[minPairIndex + 1] + ")");
        System.out.println("Pair with maximum difference: (" + arr[maxPairIndex] + ", " + arr[maxPairIndex + 1] + ")");
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 19, 18, 25};
        findMinMaxDifferencePair(arr);
    }
}
