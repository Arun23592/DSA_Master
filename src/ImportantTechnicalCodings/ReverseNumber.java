package ImportantTechnicalCodings;

public class ReverseNumber {

    public int reverseNumber(int nums){
        int reversed = 0;

        while(nums > 0){
            reversed = reversed * 10 + nums %  10;
            nums = nums / 10;
        }

        return reversed;
    }

    public static void main(String[] args){
        int nums = 1234;
        ReverseNumber rev = new ReverseNumber();
        int reverse = rev.reverseNumber(nums);
        System.out.println("Reversed Number is: "+reverse);
    }
}


/*
*
* ✅ Approach:
We’ll extract digits one-by-one using modulus and divide operations, and build the reversed number.

✅ Time and Space Complexity
Time Complexity: O(log₁₀n) — because we divide the number by 10 in each iteration.

Space Complexity: O(1) — constant space used.
*
* ✅ Interview Tip:
"I used a loop to extract each digit and rebuild the number in reverse using modulus and division. It runs in logarithmic time and uses constant space. This logic can be extended to handle negative numbers or even reverse digits of a long or string-based number."
*
*
* */