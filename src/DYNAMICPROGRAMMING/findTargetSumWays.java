package DYNAMICPROGRAMMING;

public class findTargetSumWays {


    public static int findTarget(int[] nums, int target){

        int sum = 0;

        for(int x: nums){
            sum += x;
        }

        if(sum < Math.abs(target) || (sum + target) % 2 != 0){
            return 0;
        }

        int subsetSum = (sum + target) / 2;

        int[] dp = new int[subsetSum + 1];

        dp[0] = 1;

        for (int num: nums){
            for(int j = subsetSum; j>= num; j--){
                dp[j] += dp[j - num];
            }
        }

        return dp[subsetSum];
    }

    public static void main(String[] args){
        int[] nums = {1,1,1,1,1};
        int target = 3;

        int result = findTarget(nums, target);
        System.out.println(result);
    }
}
