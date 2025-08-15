package STRING;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfEachCharacter {
    public static void main(String[] args){
        String s = "programming";

        //1. create a HashMap
        Map<Character, Integer> freqMap = new HashMap<>();
        //2. count the character
        for (char ch: s.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }

        System.out.println(freqMap);
    }
}



/*
*
* Optimal Solution: Count Character Frequency in Java
Approach
The most efficient solution uses a HashMap<Character, Integer> to count each character’s frequency in the given string:

Iterate through every character in the string.

For each character c, increment its count in the hash map.

At the end, the map holds each character and its frequency.
*
*
* Time Complexity
O(n): Each of the n characters is visited once, and HashMap operations (get, put) average O(1) time.

Space Complexity
O(k): Where k is the number of unique characters in the string.
* For ASCII/English letters, k is at most 128 or 256 (i.e., bounded and thus O(1) space for fixed character sets).
* For Unicode or arbitrary input, k may scale with n.
*
*Edge Cases to Consider
Empty String: Should return an empty map.

Null input: Decide on exception/handling behavior.

String with special characters, digits, or mixed case: Solution works as written, but requirements may dictate case insensitivity.

Very long strings: Map storage remains efficient for bounded character sets.

Whitespace handling: Depends on requirements (whitespace is counted as is).
*
*
*
*
*
* */