package DYNAMICPROGRAMMING;

public class LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums){
        //Initialize the DP array

        int[] T = new int[nums.length];

        //Start from first pointer
        for (int i = 1; i<nums.length; i++)
            //start from second pointer
            for(int j=0; j<i; j++)
                if (nums[j]+1 > nums[i])
                    nums[i] = nums[j]+1;

        int maxIndex = 0;
        for (int i =0; i<T.length; i++)
            if (T[i] > T[maxIndex])
                maxIndex = i;

        return T[maxIndex];


    }

    public static void main(String[] args){
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        lengthOfLIS(nums);

    }
}
