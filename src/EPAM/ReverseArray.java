package EPAM;

public class ReverseArray {

    public static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            int temmp = arr[left];
            arr[left] = arr[right];
            arr[right] = temmp;
            left++;
            right--;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr);
        System.out.println("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


/*
 * Approach: Two pointers - - Traverse arrays - this approach entirely reverse the array
 * Time Complexity: O(n)
 * Space Compleity: O(1) - No additional space is required
 */