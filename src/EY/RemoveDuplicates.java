package EY;

import java.util.LinkedHashSet;
import java.util.Map;

public class RemoveDuplicates {

    public static String removeDuplicates(String str){

        //1. using LinkedHashSet

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c: str.toCharArray()){
            set.add(c);
        }


        //2. StringBuilder for efficient concatenation
        StringBuilder result = new StringBuilder();

        for (char c: set){
            result.append(c);
        }

        //return results
        return result.toString();

    }

    public static void main(String[] args){
        String str = "Programming";
        String removed = removeDuplicates(str);
        System.out.println("Duplicates removed: "+removed);

    }
}


/**
 * input = "Programming"
 * output = "Progamin"
 *
 *
 * ✅ Approach Used in This Code
 * --LinkedHashSet-based approach--
 *
 * Uses a LinkedHashSet to:
 *
 * Automatically remove duplicates
 *
 * Preserve insertion order
 *
 *
 *
 * Step 1: Create a LinkedHashSet
 *
 * Guarantees:
 *
 * No duplicate characters
 *
 * Original order is preserved
 *
 *
 * Step 2: Convert string to char array
 *
 * Add each character to the set
 *
 * Duplicate characters are ignored automatically
 *
 *
 * Example:
 * "Programming" → P r o g r a m m i n g
 * Set → P r o g a m i n
 *
 *
 * Step 3: Use StringBuilder for efficient string concatenation
 * Step 4: Append unique characters (in order) to result
 * Step 5: Convert StringBuilder to string and return
 *
 * Duplicates removed: Progamin
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 *
 *
 * 🔁 Alternate Approaches
 * 🔹 1. Boolean Array (Most Efficient for ASCII)
 * public static String removeDuplicates(String s) {
 *     boolean[] seen = new boolean[256];
 *     StringBuilder sb = new StringBuilder();
 *
 *     for (char c : s.toCharArray()) {
 *         if (!seen[c]) {
 *             sb.append(c);
 *             seen[c] = true;
 *         }
 *     }
 *     return sb.toString();
 * }
 *
 * Complexity:
 * Time: O(n)
 * Space: O(1) (fixed array size)
 *
 * 🔹 2. Java Streams (Readable but less interview-preferred)
 * String result = s.chars()
 *                  .distinct()
 *                  .mapToObj(c -> String.valueOf((char)c))
 *                  .collect(Collectors.joining());
 *
 * Summary:
 * I used a LinkedHashSet to remove duplicates while preserving insertion order. The solution runs in O(n) time and is clean and readable. For further optimization, a boolean array can reduce space usage.”
 *
 *
 * */