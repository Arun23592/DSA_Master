package STRING;

import java.util.LinkedHashSet;

public class RemoveDuplicateString {

    public static String removeDuplicateString(String s){
        // Use LinkedHashSet to maintain insertion order and remove duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char c : s.toCharArray()){
            set.add(c);
        }

        // Build the resulting string
        StringBuilder result = new StringBuilder();

        for(char c : set){
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args){
        String s= "programming";

        String result = removeDuplicateString(s);
        System.out.println("String after removing duplicates: " + result);
    }
}


/*
* Time Complexity:
O(n) — where n is the length of the string.
*
*
* */
