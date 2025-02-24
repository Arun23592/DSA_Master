package TwoPointers;

import java.util.Arrays;

public class MoveAllZerosLeft {

    public void moveZeros(int[] nums){
        int start= nums.length-1, end= nums.length-1;
        while (end >=0){
            if (nums[end] == 0){
                end--;
            }else {
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                end--;  
                start--;

            }
        }

    }

    public static void main(String[] args){
        int[] nums = {1, 0, 2, 0, 3,  0};
        MoveAllZerosLeft moveAllZerosLeft = new MoveAllZerosLeft();
        moveAllZerosLeft.moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
