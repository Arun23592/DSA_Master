package ARRAYS;

public class SecondLargestElement {

    public static int secondLargest(int[] nums){
        if(nums == null || nums.length < 2){
            throw new IllegalArgumentException("Array must be atleast 2 elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num: nums){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;

    }

    public static void main(String[] args){
        int[] nums = {10, 20, 4, 45, 99};

       int secondLarge = secondLargest(nums);
        System.out.println("Second Largest element is: "+secondLarge);
    }
}

/*

This program finds the second largest element in an integer array in a single pass, without sorting.
I'll walk you through the logic, edge cases I handled, and the complexity.

Approach:
I used the greedy single-pass approach — I make the optimal local decision at every element without backtracking.
No sorting, no extra data structure. Just two variables updated in one linear scan — giving the best possible O(n) time and O(1) space."

*
**/