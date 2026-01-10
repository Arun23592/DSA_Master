package EPAM;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static String removeDuplicates(String s){
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char c: s.toCharArray()){
            set.add(c);
        }

        StringBuilder result = new StringBuilder();

        for(char c: set){
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args){
        String s = "programming";
        String removed = removeDuplicates(s);
        System.out.println(removed);
    }
}
