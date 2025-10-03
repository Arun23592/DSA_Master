package STRING;

public class ReverseWordsInString {

    public String reverseWord(String s){
        String[] str = s.trim().split("\\s+");
        String rev = "";

        for(int i=str.length-1; i>0; i--){
            rev += str[i] + " ";
        }
        return rev + str[0];
    }

    public static void main(String[] args){
        String s = "YOU CANT SEE ME";
        ReverseWordsInString reverse = new ReverseWordsInString();
        String reversedString = reverse.reverseWord(s);
        System.out.println("Reversed word is: "+reversedString);
    }
}


/*
*
* ✅ APPROACH
Trim the input to remove leading/trailing spaces.

Split the string by one or more spaces using the Regex \\s+.

Reverse the words by looping backward and concatenating words with spaces.

Return the reversed result.

⚡️ TIME COMPLEXITY
Splitting the string takes O(n) where n is the length of the input.

Reversing the array of words and concatenation takes roughly O(n).

Final Complexity: O(n)

🗄️ SPACE COMPLEXITY
The array created by split() is O(w) where w is the number of words.

The result rev takes O(n).

Final Complexity: O(n)

✅ EXAMPLES / TEST CASES
Input	Output
"hello world"	world hello
" hello world "	world hello
"one two three"	three two one
"" (empty)	""
"single"	single
"a b c"	c b a

🎤 POSSIBLE INTERVIEW QUESTIONS
What is the time and space complexity of this approach?

Will this work if the input contains multiple spaces? Why or why not?

How can you implement this method in‑place or using a StringBuilder for efficiency?

What would you do if the input is null or an empty String?

What are some alternatives for splitting strings (e.g., using StringTokenizer)?

How would you handle Unicode spaces or other whitespace characters?

What is the output for input like: s = "hello"? Will it work as expected?

Could you implement the reversal in O(1) space (other than the input)?


*
*
* */
