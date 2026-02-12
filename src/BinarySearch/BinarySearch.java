package BinarySearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + high / 2;

            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }else {
                low = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = ;
        int target = 23;

        int result = binarySearch(arr, target);
        System.out.println(result != -1 ? "Found at index: " +result : "Not found");
    }
}

/**
 *
 * What Is Binary Search?
 * Binary Search works by repeatedly dividing the search range in half. It compares the target value to the middle element of the array:
 *
 * If they match, the search is complete.
 *
 * If the target is smaller, it searches the left half.
 *
 * If the target is larger, it searches the right half.
 *
 * This continues until the element is found or the range is empty.
 *
 *
 *
 * */