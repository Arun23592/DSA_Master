package TwoPointers;

import java.util.Arrays;

public class MoveAllZerosRight {

    public static int[] moveZeros(int[] nums){

        int position = 0;

        for (int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[position];
                nums[position] = temp;
                position++;
            }
        }
        return nums;
    }

    public static void main(String[] args){
        int[] nums = {1, 0, 2, 0, 3,  0};
        MoveAllZerosRight moveAllZerosLeft = new MoveAllZerosRight();
        moveAllZerosLeft.moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
