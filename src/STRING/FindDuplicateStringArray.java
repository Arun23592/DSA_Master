package STRING;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicateStringArray {
    public static void main(String[] args){
        String[] arr = {"java", "python", "selenium", "java", "python", "api"};

        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicate = new HashSet<>();

        for(String value: arr){
            if (seen.add(value)){
                duplicate.add(value);
            }
        }
        System.out.println("Duplicate Elements: "+duplicate);
    }
}
