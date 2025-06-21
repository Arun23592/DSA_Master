package STRING;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {

    public static void main(String[] args) {
        String input = "Siemens".toLowerCase();

        Map<Character, Integer> countMap = new HashMap<>();

        for(char ch : input.toCharArray()){
            countMap.put(ch, countMap.getOrDefault(ch, 0)+ 1);
        }

        System.out.println("Duplicate characters in the string are:");
        for (Map.Entry<Character, Integer> entry: countMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }


}


/*
* This code finds duplicate characters in a given string and counts their occurrences.
*
* It uses a HashMap to store each character as a key and its count as the value.
* * The program iterates through the string, updating the count for each character.
* * Finally, it prints out the characters that appear more than once along with their counts.
* * Example: If the input string is "Siemens", the output will show 's' and 'e' as duplicate characters with their respective counts.
* * Time Complexity: O(n), where n is the length of the input string.
* Space Complexity: O(n) for storing the character counts in the HashMap.
* * Usage: Run the main method with a string input to see the duplicate characters and their counts.
* * Note: The input string is converted to lowercase to ensure case-insensitivity when counting duplicates.
*
*
* */
