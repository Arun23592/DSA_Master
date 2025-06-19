package STRING;

import java.util.Arrays;

public class MaximumSumSubArray {

    public static int sumSubArray(int[] arr){
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for(int i=0; i<arr.length; i++){
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args){
        int[] arr = {5,4,-1,7,8};
        System.out.println("maximum sum of sub array: "+ sumSubArray(arr));
    }
}
