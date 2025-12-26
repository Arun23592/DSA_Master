package EY;

import java.util.HashMap;
import java.util.Map;

public class checkAnagram {

    public static boolean isAnagram(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        Map<Character, Integer> freqMap = new HashMap<>();

        //count the frequency of the character in first string
        for(char ch: str1.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }

        for (char ch: str2.toCharArray()){

            if(!freqMap.containsKey(ch)){
                return false;
            }
            freqMap.put(ch, freqMap.get(ch) - 1);

            if(freqMap.get(ch) < 0){
                return false;
            }
        }

        return true;

    }


    public static void main(String[] args){
        String str1 = "tomato";
        String str2 = "matoto";
        boolean result = isAnagram(str1, str2);
        System.out.println("is str1 and str2 are anagram: "+result);
    }
}


/**
 * Approach (Explain this in interview)
 *
 * If lengths are different → not anagram
 *
 * Count character frequency of first string
 *
 * Decrease frequency using second string
 *
 * If any frequency becomes negative → not anagram
 *
 * If all checks pass → anagram
 *
 *
 *Example Walkthrough (Explain verbally)
 * str1 = tomato → {t=2, o=2, m=1, a=1}
 * str2 = matoto → subtract counts
 * All frequencies reach 0 → Anagram
 *
 * Time complexity:
 * O(n)
 *
 *
 * 🔥 Alternative Approach 1 — Sorting (Simple but less efficient)
 * Approach
 *
 * Convert strings to char arrays
 *
 * Sort both arrays
 *
 * Compare arrays
 *
 *
 * import java.util.Arrays;
 *
 * public class AnagramSorting {
 *
 *     public static boolean isAnagram(String s1, String s2) {
 *
 *         if (s1.length() != s2.length()) return false;
 *
 *         char[] a1 = s1.toCharArray();
 *         char[] a2 = s2.toCharArray();
 *
 *         Arrays.sort(a1);
 *         Arrays.sort(a2);
 *
 *         return Arrays.equals(a1, a2);
 *     }
 * }
 *
 * Time	O(n log n)
 * Space	O(1)
 *
 * 📌 Mention in interview: Easy to understand but not optimal
 *
 *
 * 🚀 Alternative Approach 2 — Fixed Array (Best for lowercase letters)
 * Approach
 *
 * Use int[26] array (only lowercase letters)
 *
 *
 * public static boolean isAnagram(String s1, String s2) {
 *     if (s1.length() != s2.length()) return false;
 *
 *     int[] count = new int[26];
 *
 *     for (char c : s1.toCharArray()) {
 *         count[c - 'a']++;
 *     }
 *
 *     for (char c : s2.toCharArray()) {
 *         if (--count[c - 'a'] < 0) return false;
 *     }
 *
 *     return true;
 * }
 *
 * Time: O(n)
 * Space: O(1)
 *
 * */