package ARRAYS;

public class FirstandFinalOccurrenceNumber {


    public static int firstOccurrence(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int firstOccurrence = -1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                firstOccurrence = mid;
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return firstOccurrence;

    }


    public static int lastOccurrence(int[] nums, int target){
        int left = 0, right = nums.length - 1;

        int lastOccurrence = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                lastOccurrence = mid;
                left = mid + 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        return lastOccurrence;
    }

    public static int[] firstandlastOccurrence(int[] nums, int target){
        int[] result = {-1, -1};

        if(nums == null || nums.length == 0) return result;

        result[0] = firstOccurrence(nums, target);
        result[1] = lastOccurrence(nums, target);

        return result;
    }


    public static void main(String[] args){
        int[] nums = {1, 3, 4, 5, 5, 8};
        int target = 8;

        int[] occurrences = firstandlastOccurrence(nums, target);
        System.out.println(occurrences[0]);
        System.out.println(occurrences[1]);

    }
}
