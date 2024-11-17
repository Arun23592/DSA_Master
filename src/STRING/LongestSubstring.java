package STRING;

import java.util.HashMap;
import java.util.*;

public class LongestSubstring {

    public int lengthOfLongestString(String s){
        int maximumLength = 0;

        Map<Character, Integer> visitedCharacters = new HashMap<>();

        for(int left=0, right=0; right<s.length(); right++){
            char currentCharacter = s.charAt(right);
            if (visitedCharacters.containsKey(currentCharacter) && visitedCharacters.get(currentCharacter) >= left){
                left = visitedCharacters.get(currentCharacter) + 1 ;
            }
            maximumLength = Math.max(maximumLength, right - left + 1);
            visitedCharacters.put(currentCharacter, right);
        }
        return maximumLength;
    }

    public static void main(String[] args){
        String s = "abcabcd";
        LongestSubstring substring = new LongestSubstring();
        int str = substring.lengthOfLongestString(s);
        System.out.println(str);
    }
}
