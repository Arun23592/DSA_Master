package ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class Zigzag_SortArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int left = 0;
        int right = arr.length - 1;

        List<Integer> result = new ArrayList<>();

        while (left <= right){
            result.add(arr[left++]);
            if (left <= right){
                result.add(arr[right--]);
            }
        }

        for (int num: result){
            System.out.print(num+" ");
        }
    }
}


/**
 *
 * input: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
 * output: 1, 10, 2, 9, 3, 8, 4, 7, 5, 6
 *
 * Approach: Two Pointers
 *
 * Sort the array (though in your case it’s already sorted).
 *
 * Use two pointers:
 *
 * left → start of array (smallest).
 *
 * right → end of array (largest).
 *
 * Alternate picking from left and right until they meet.
 * */