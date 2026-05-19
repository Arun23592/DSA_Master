package ARRAYS;

import java.util.Arrays;

public class ReversearraySubsetOfN {

    //Approach: Two pointers

    public static void reverseSubset(int[] num, int N){
        //1. transverse the array and length
        for(int i=0; i<num.length; i+=N){
            //2. find start and end index within group
            int left = i;
            int right = Math.min(i+N - 1, num.length - 1);

            //3. reverse within the group
            while(left < right){
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
                left++;
                right--;
            }

        }





    }


    public static void main(String[] args){
        int[] num = {1,3,5,7,9,11,15,17,19};
        int N = 6;

        System.out.println(Arrays.toString(num));
        reverseSubset(num, N);
        System.out.println(Arrays.toString(num));
    }
}
