package ImportantTechnicalCodings;

public class ReverseString {

    public static void main(String[] args){
        String s = "Adiah";
        String reverse = "";

        for(int i=s.length()-1; i>=0; i--){
            reverse = reverse + s.charAt(i);
        }

        System.out.println("reverse string is: "+reverse);
    }
}

/*
* "Steps:
 * 1. Initialize
 * 2. Iterate
 * 3. Concatenate
 * 4. print output"
 *
 * Approach:
 *
 * Reverse by Iteration and Concatenation
 *
 * Time complexity:
 * "O(n) -> Where n is the length of the input string. This is because the for loop
 * iterates through each character exactly once."
 *
 * Space complexity:
 * Space complexity: O(n) -> Because we are storing the reversed string in a new string variable.
 *
 * Explanation:
 *
 * "Explanation:
 * 1. Initialize input string and create a variable to store  the reversed string
 * 2. Iterate through the string from the end to the start
 * 3. Concatenate each character to the reversed string
 * 4. Print the reversed string"
*
*
*
* */