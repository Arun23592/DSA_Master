package ARRAYS;

public class FindMissingPositive {

    public int missingNumber(int[] nums){
        if(nums == null || nums.length == 0) return 1;
        int n = nums.length, containsOne = 1;

        //step1
        for (int i=0; i<n; i++){
            if (nums[i] == 1){
                containsOne = 1;
            } else if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = 1;
            }
        }

        if (containsOne == 0) return 1;

        //step 2
        for (int i=0; i<n; i++){
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) nums[index] = -1 * nums[index];
        }

        //step3
        for (int i=0; i<n; i++){
            if (nums[i] > 0){
                return i + 1;
            }
        }
        return n + 1;
    }


    public static void main(String[] args){
        int[] nums = {3, 4, -1, 1};
        FindMissingPositive missing = new FindMissingPositive();
        System.out.println("First Missing Positive: "+missing.missingNumber(nums));
    }
}
