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



/*

✅ APPROACH
The method removes duplicates from a sorted array in place:

Maintain two pointers:

i to scan through the array.

j to point to the position of the next unique element.

Compare the current element with the previous one:

If different, move it to nums[j].

Final result:

First j elements of nums are unique.

Return the new length (j).

⚡️ TIME COMPLEXITY
Single pass through the array ➔ O(n).

💾 SPACE COMPLEXITY
No additional data structures used ➔ O(1) (in‑place).

🔍 STEP‑BY‑STEP EXPLANATION
Input: nums = [0,0,5,5,1,1,1,2,2,3,3,4]

1️⃣ Initial State:
j = 1 (next position for unique element)

2️⃣ Loop Through Array:
i = 1: nums[1] = 0 ➔ same as nums[0] ➔ skip

i = 2: nums[2] = 5 ➔ diff ➔ nums[1] = 5 ➔ j = 2

i = 3: nums[3] = 5 ➔ same as nums[2] ➔ skip

i = 4: nums[4] = 1 ➔ diff ➔ nums[2] = 1 ➔ j = 3

i = 5: nums[5] = 1 ➔ skip

i = 6: nums[6] = 1 ➔ skip

i = 7: nums[7] = 2 ➔ diff ➔ nums[3] = 2 ➔ j = 4

i = 8: nums[8] = 2 ➔ skip

i = 9: nums[9] = 3 ➔ diff ➔ nums[4] = 3 ➔ j = 5

i = 10: nums[10] = 3 ➔ skip

i = 11: nums[11] = 4 ➔ diff ➔ nums[5] = 4 ➔ j = 6

✅ Final Result:
nums after removing duplicates:


nginx
Copy
Edit
Index 0 1 2 3 4 5
Value 0 5 1 2 3 4
Final length returned: 6

✅ EXAMPLE OUTPUT
Input:

csharp
Copy
Edit
[0,0,5,5,1,1,1,2,2,3,3,4]
Output:

mathematica
Copy
Edit
After Removed Duplicates: [0,5,1,2,3,4]
🧪 TEST CASES
Input	Output
[1,1,1,1]	[1]
[1,2,3,4]	[1,2,3,4]
[]	[]
[1,1,2,2,3,3,3,4,5]	[1,2,3,4,5]
[0,0,5,5,1,1,1,2,2,3,3,4]	[0,5,1,2,3,4]

❓ POTENTIAL INTERVIEW QUESTIONS
What is the time and space complexity of your approach?

What if the array was unsorted? Will this approach still work?

Could you do this for a LinkedList?

What if the array can be very large? Will this approach still be efficient?

Could you solve this using a Set? What are the pros and cons?

What are other approaches for removing duplicates? (e.g., using hash maps)




*
*
 */