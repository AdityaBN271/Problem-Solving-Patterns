import java.util.Scanner;

public class binary_search {
    public static int binarySearch(int[] arr, int target) {
       
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid -1;

            }


        }
        return -1;

    public static void main(String[] args) {
        int [] SortedArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 14;
        int result = binarySearch(SortedArray, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
    }


    }

    
}