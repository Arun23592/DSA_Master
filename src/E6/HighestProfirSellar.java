package E6;

import com.sun.source.tree.LiteralTree;

import java.util.*;

public class HighestProfirSellar {

    public static void main(String[] args){
        List<String> fruits = Arrays.asList(
                "apple", "banana", "apple",
                "orange", "banana", "apple"

        );

        Map<String, Integer> freqMap = new HashMap<>();

        for(String fruit: fruits){
            freqMap.put(fruit, freqMap.getOrDefault(fruit, 0)+1);
        }

        System.out.println("Frequency of map: "+freqMap);


        List<Map.Entry<String, Integer>> fruitList = new ArrayList<>(freqMap.entrySet());

        fruitList.sort((a, b) -> b.getValue() - a.getValue());
            if (fruitList.size() < 2){

                System.out.println("No second highest fruit seller");
            }else {
                System.out.println("Second highest fruit seller: "+ fruitList.get(1).getKey());
            }
    }


}
