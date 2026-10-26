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


/***
 * Dynamic programming -- Optimal approach
 *
 *
 * Intuition & Logic
 * We can reduce the Target Sum problem to the Subset Sum problem: finding subset sum equal to exactly S1 = (totalSum + target) / 2. We can solve this subset sum in optimal 1D space.
 *
 * Here is the step-by-step logic:
 *
 * 1. Sum all elements in nums. If totalSum < abs(target) or (totalSum + target) is odd, return 0.
 * 2. Set subsetSum = (totalSum + target) / 2.
 * 3. Initialize a 1D DP array dp of size subsetSum + 1 with 0, and set dp[0] = 1.
 * 4.For each number num in nums:
 * Iterate j backwards from subsetSum down to num:
 * Update dp[j] += dp[j - num].
 * Return dp[subsetSum].
 *
 * "This bottom-up space-optimized Dynamic Programming solution runs in optimal O(N * Target) time and O(Target) space."
 *
 *Time Complexity
 * O(N * Target)
 *
 * Space Complexity
 * O(Target)
 *
 */