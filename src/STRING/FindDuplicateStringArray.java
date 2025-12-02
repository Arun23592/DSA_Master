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


/*
(Optimal Approach using HashSet)
* Output: Duplicate Elements: [java, python]
 *Explanation (Interview):
“I used a HashSet because insertion is O(1). If add() returns false, the element already exists, meaning it's a duplicate.”


Another easy approach:

def find_duplicates(input):
    return list(set(input))

input = "programming"
print(find_duplicates(input))def find_duplicates(input):
    return list(set(input))

input = "programming"
print(find_duplicates(input))


* */
