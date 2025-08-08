package STRING;

import java.util.Arrays;

public class StringsareAnagaramsOrNot2 {

    public static boolean areAnagarams(String str1, String str2){
        //1. check the length of the strings
        if(str1.length() != str2.length()){
            return false;
        }
        //2. intialize count array
        int[] count = new int[26];

        //3. count occurrences in str1
        for (int i=0; i<str1.length(); i++){
            count[str1.charAt(i) - 'a'] += 1;
        }

        //4. count occurrence in str2
        for (int i=0; i<str2.length(); i++){
            if(count[str2.charAt(i) - 'a'] == 0) return false;
            count[str2.charAt(i) - 'a'] -= 1;
        }

        return true;
    }

    public static void main(String[] args){
        String str1 = "tomato";
        String str2 = "matoto";

        if(areAnagarams(str1, str2)){
            System.out.println("Strings are anagarams");
        }else {
            System.out.println("Strings are not anagarams");
        }
    }
}


/*
*
* ✅ Time & Space Complexity
Time Complexity:

Sorting both strings: O(n log n)

Space Complexity:

O(n) (to hold char arrays)

“To validate anagrams efficiently, I prefer using character frequency counts over sorting. This gives O(n) time and constant space when dealing with lowercase English letters. I also normalize inputs by removing whitespace and converting to lowercase if case-insensitive validation is required.”


Interview Soundbite
“To validate anagrams efficiently, I prefer using character frequency counts over sorting. This gives O(n) time and constant space when dealing with lowercase English letters. I also normalize inputs by removing whitespace and converting to lowercase if case-insensitive validation is required.”
*
*
* */