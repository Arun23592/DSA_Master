package ARRAYS;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicatesArray(int[] nums){
        if(nums.length == 0)
            return 0;

        int j=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args){
        int[] nums = {0,0,5,5,1,1,1,2,2,3,3,4};
        RemoveDuplicatesFromSortedArray duplicate = new RemoveDuplicatesFromSortedArray();
        int duplicateArrays = duplicate.removeDuplicatesArray(nums);
        System.out.print("After Removed Duplicates: [");
        for (int i=0; i<duplicateArrays; i++){
            System.out.print(nums[i]);
            if(i < duplicateArrays -1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
