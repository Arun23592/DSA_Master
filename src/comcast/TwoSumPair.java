package comcast;

import java.util.HashMap;
import java.util.Map;

public class TwoSumPair {

    public int[] targetSum(int[] nums, int target){

        Map<Integer, Integer> complements = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            Integer complementIndex = complements.get(nums[i]);

            if(complementIndex != null){
                return new int[]{complementIndex, i};
            }

            complements.put(target - nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args){
        int[] nums = {6, 8, 11, 6, 7, 18, 2};
        int target = 17;
    TwoSumPair sum = new TwoSumPair();

    int[] targetPair = sum.targetSum(nums, target);

    if (targetPair.length == 0){
        System.out.println("No solution found");
    }else {
        System.out.println("two sum: "+targetPair[0]+ ", "+ targetPair[1]);
    }


    }
}
