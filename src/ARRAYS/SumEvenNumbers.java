package ARRAYS;

public class SumEvenNumbers {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6};

        int sum = 0;

        for(int arr: nums){
            if(arr % 2 == 0){
                sum += arr;
            }

        }

        System.out.println("sum of even numbers: "+sum);
    }
}
