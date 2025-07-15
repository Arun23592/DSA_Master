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

/*
*
* Write a Java program for the given string transformation:
Input: tomorrow
Output: t3m3223w
Breakdown:

Frequencies:
t → 1
o → 3
m → 1
r → 2
w → 1

Replace characters based on frequency:

t → t

o → 3

m → m

o → 3

r → 2

r → 2

o → 3

w → w
→ t3m3223w
*
*
* ✅ Edge Cases
Case	Input	Output
Empty string	\"\"	\"\"
All unique characters	abc	abc
All same characters	aaa	333
Case sensitivity	aAa	aAa or 3 (based on design)


* ✅ Interview Follow-Up Questions
Can you make the transformation case-insensitive?
→ Convert input.toLowerCase() during frequency count.

Can you return original characters replaced only after the 2nd occurrence?
→ Track index while transforming.

How would you handle special characters and digits?
→ Current code works for all characters by default.

How to maintain order of appearance?
→ This implementation does preserve order by design.

*
*

*
*
*
*
*
*
*
* */