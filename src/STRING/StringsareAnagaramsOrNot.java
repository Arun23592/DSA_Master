package STRING;

import java.util.Arrays;

public class StringsareAnagaramsOrNot {

    public static boolean areAnagarams(String str1, String str2){
        //1. check the length of the strings
        if(str1.length() != str2.length()){
            return false;
        }
        //2. convert string to character
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        //3. sort the arrays
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        //4. return arrays are equal
        return  Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args){
        String str1 = "tomato";
        String str2 = "matotoa";

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

✅ Edge Cases to Consider
Case	Result
str1 = "a", str2 = "a"	✅ Anagram
str1 = "abc", str2 = "ab"	❌ Not anagram
str1 = "", str2 = ""	✅ Anagram
str1 = "Listen", str2 = "Silent"	✅ Anagram (after converting to lowercase)
str1 = "aab", str2 = "aba"	✅ Anagram


*
*
* */