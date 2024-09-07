package ARRAYS;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums){
        int n = nums.length;
        int totalSum = (n*(n+1)) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return totalSum - actualSum;
    }



    public static void main(String[] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        MissingNumber miss = new MissingNumber();
        int missing = miss.missingNumber(nums);
        System.out.println("Missing number is : "+missing);
    }

}


