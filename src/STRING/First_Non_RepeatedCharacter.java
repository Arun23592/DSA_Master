package STRING;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class First_Non_RepeatedCharacter {

    public static List<Character> firstNonRepeatedCharacter(String input){
        if(input == null || input.isEmpty()){
            return null;
        }

        //1. count the frequency using LinkedHashMap
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        String output = input.toLowerCase();

        for (char ch: output.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }

        //2. FInd the character with count equal to 1.

    }

    public static void main(String[] args){
        String input = "Is it your first company";
    }
}
