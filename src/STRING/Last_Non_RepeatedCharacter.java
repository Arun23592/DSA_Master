package STRING;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Last_Non_RepeatedCharacter {

    public static Character LastNonRepeatedCharacter(String input){
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
        Character nonRepeatedCharacter = null;
        for (Map.Entry<Character, Integer> entry: freqMap.entrySet()){
            if(entry.getValue() == 1){
//                System.out.println(entry.getKey());  //printing all the non-repeated characters
                nonRepeatedCharacter = entry.getKey();

            }

        }

        return nonRepeatedCharacter;
    }

    public static void main(String[] args){
        String input = "Is it your first company";

        Character results = LastNonRepeatedCharacter(input);

        if (results != null){
            System.out.println("Last Non-Repeated character is: "+results);
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
 *
 * */