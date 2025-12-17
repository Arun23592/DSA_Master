package STRING;

import java.util.ArrayList;
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
        List<Character> nonRepeatedCharacter = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry: freqMap.entrySet()){
            if(entry.getValue() == 1){
//                System.out.println(entry.getKey());  //printing all the non-repeated characters
                nonRepeatedCharacter.add(entry.getKey());

            }

        }

        return nonRepeatedCharacter;
    }

    public static void main(String[] args){
        String input = "swiss";

        List<Character> results = firstNonRepeatedCharacter(input);

        if (!results.isEmpty()){
            System.out.println("All Non-Repeated character is: "+results.get(1));
        }else {
            System.out.println("Non-Repeated characters not found: ");
        }
    }
}

/**
 *
 * input = "Is it your first company"
 * input = "swiss"
 *
 * */