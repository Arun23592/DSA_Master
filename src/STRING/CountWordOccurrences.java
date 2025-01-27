package STRING;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccurrences {

    public static void main(String[] args){
        String input = "Hello world! Hello, Java. Welcome to the Java world.";
        String[] words = input.toLowerCase().split("\\W+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word: words){
            if (!word.isEmpty()){
                wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
            }
        }
        System.out.println("Word occurrence:");
        for (Map.Entry<String, Integer> entry: wordCount.entrySet()){
            System.out.println(entry.getKey() +": "+entry.getValue());
        }
    }
}
