package STRING;

import java.util.HashMap;
import java.util.Map;

public class ReplaceChracterswithFrequency {

    public static String replaceCharactersFreq(String s){
        //1. Create HashMap
        Map<Character, Integer> freqMap = new HashMap<>();

        //2. count each character
        for(char c: s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

        }

        //3. StringBuilder initialization
        StringBuilder result = new StringBuilder();

        for (char c: s.toCharArray()){
            int freq = freqMap.get(c);
            result.append(freq == 1 ? c : String.valueOf(freq));
        }

        return result.toString();
    }
    public static void main(String[] args){
        String s = "tomorrow";
        String transformed = replaceCharactersFreq(s);
        System.out.println("Input: "+s);
        System.out.println("Input: "+transformed);

    }
}
