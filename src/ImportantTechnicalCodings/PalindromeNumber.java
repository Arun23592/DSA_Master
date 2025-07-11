package ImportantTechnicalCodings;

public class PalindromeNumber {

    public static boolean isPalindrome(int number){
        if(number < 0 || (number % 10 == 0 && number != 0)){
            return false;
        }
        int original = number;
        int reversed = 0;

        while(number > 0){
            int digit = number % 10;  //to get last digit
            reversed  = reversed * 10 + digit; //Build reversed number
            number = number / 10;
        }
        return  original == reversed;
    }

    public static void main(String[] args){
        int number = 10;
        if (isPalindrome(number)){
            System.out.println(number+ " - Is a Palindrome");
        }else {
            System.out.println(number+ "- Is Not a Palindrome");
        }
    }
}


/*
* ✅ What is a Palindrome Number?
A number is a palindrome if it reads the same forward and backward.

Examples:

✅ 121 → Palindrome

✅ 1221 → Palindrome

❌ 123 → Not a Palindrome
*
*
* ✅ Approach:
Extract digits from the number in reverse order.

Compare the original number with the reversed number.

If they match → It’s a palindrome.
*
* ✅ Time & Space Complexity:
Metric	Value
Time Complexity	O(log₁₀ n) → One loop per digit
Space Complexity	O(1) → Constant space
*
* ✅ Bonus: Edge Case Handling
Negative numbers are not palindromes.
You can add this check:

* if (num < 0) return false;

*
* ✅ Interview Summary Statement:
“To check if a number is a palindrome, I reverse the digits using modulus and division, then compare the reversed number with the original.
* This approach runs in O(log n) time and uses O(1) space.
* It’s clean, efficient, and avoids string conversion, making it ideal for constrained environments or interviews.”

*
*
* */