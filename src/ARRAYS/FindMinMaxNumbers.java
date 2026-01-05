package ARRAYS;

import java.util.Arrays;

public class FindMinMaxNumbers {

    public static int[] findMinMax(int[] arr){
        //1. initalize the variables min and max
        int min = arr[0];
        int max = arr[0];

        for(int num: arr){
            if (num < min) min = num;
            if(num > max)  max = num;
        }

        return new int[]{min, max};
    }
    public static void main(String[] args){
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int[] result = findMinMax(arr);
        System.out.println(Arrays.toString(result));
    }
}


/**
 *
 *
 * ✅ Approach
 * Initialize two variables:
 *
 * min = first element of the array.
 *
 * max = first element of the array.
 *
 * Loop through the array:
 *
 * If current element < min, update min.
 *
 * If current element > max, update max.
 *
 * Return [min, max].
 *
 * This runs in O(n) time with O(1) extra space.
 *
 *
 *
 * */