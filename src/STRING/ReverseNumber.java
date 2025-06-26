package STRING;

public class ReverseNumber {

    public int reverseNumber(int nums){
        int rev = 0;
        while (nums > 0){
            rev = rev * 10 + nums % 10;
                nums = nums / 10;
        }
        return rev;
    }

    public static void main(String[] args){
        int nums = 1234;
        ReverseNumber reverseNum = new ReverseNumber();
        int reverse = reverseNum.reverseNumber(nums);
        System.out.println("Reversed number:"+reverse);
    }
}




/*
*
* ✅ APPROACH
The method:

ReverseNumber(int nums) takes an integer and reverses its digits.

It uses the approach of extracting the last digit (nums % 10), adding it to rev after multiplying rev by 10, and repeating until the input number is depleted (nums == 0).

Example:
Input: 1234
Iteration 1: rev = 0 * 10 + (1234 % 10) ➔ rev = 4
Iteration 2: rev = 4 * 10 + (123 % 10) ➔ rev = 43
Iteration 3: rev = 43 * 10 + (12 % 10) ➔ rev = 432
Iteration 4: rev = 432 * 10 + (1 % 10) ➔ rev = 4321

Result: 4321

⚡ TIME COMPLEXITY
The loop runs once for every digit of the number.

If the number has d digits, the complexity is O(d).

In terms of the value of the number (n), it's roughly O(log₁₀n).

💾 SPACE COMPLEXITY
The method uses a constant amount of space (rev, nums), regardless of input size.

Hence, space complexity is O(1).

📋 TEST CASES
Input	Output
1234	4321
1000	1
0	0
98765	56789
10	1
-123	Will result in undefined behavior (no handling for negatives!)
2147483647	Will cause integer overflow when reversed.

❓ INTERVIEW QUESTIONS
Here are some questions an interviewer might ask:

What is the time and space complexity of your solution?

Will this method work for negative numbers? How can you adapt it?

What about integer overflow? What if the reversed number doesn’t fit into an integer?

Could you implement this method recursively?

What are some edge cases you can think of?

How would you implement the same for a long integer?

What are the constraints of this approach?

Could this approach be implemented for other bases (binary, hex)?

What are other ways to reverse an integer? (e.g., converting to a String)


*
* */