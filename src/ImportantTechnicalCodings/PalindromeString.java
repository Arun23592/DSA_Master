package ImportantTechnicalCodings;

public class PalindromeString {

    public static boolean isPalindromeString(String str){
        String sts = str.toLowerCase();
        String st = sts.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = st.length() - 1;

        while (left < right){
            if (st.charAt(left) != st.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args){
        String str = "Madams";
        System.out.println(isPalindromeString(str));
    }
}


/*
* ✅ What is a String Palindrome?
A string is a palindrome if it reads the same forward and backward, ignoring case.

Examples:

✅ "dad" → Palindrome

✅ "DAD" → Palindrome (case-insensitive)

❌ "hello" → Not a Palindrome
*
* ✅ Approach 1: Two-Pointer Technique (Optimal)
* ✅ Step-by-Step Explanation:
For input: "DAD"

Convert to lowercase: "dad"

Compare characters from both ends:

str.charAt(0) == str.charAt(2) → d == d

str.charAt(1) == str.charAt(1) → a == a ✅

Since all match, the string is a palindrome.
*
* ✅ Time & Space Complexity:
Metric	Value
Time Complexity	O(n)
Space Complexity	O(1) (in-place comparison)
*
* ✅ Interview Follow-Up Questions:
How would you check for phrase palindrome (ignoring spaces/punctuation)?

Can you use recursion to solve it?

Can you check number palindromes using string methods?

What’s the difference between StringBuilder vs manual comparison?

How would you handle Unicode or special characters?


*
* ✅ Interview Summary Statement:
“To check if a string is a palindrome, I compare characters from both ends using a two-pointer approach.
* It's case-insensitive, efficient with O(n) time and O(1) space, and avoids extra allocations.
*  It's clean, fast, and interview-friendly for most scenarios.”
*
*
*
*
*
* */