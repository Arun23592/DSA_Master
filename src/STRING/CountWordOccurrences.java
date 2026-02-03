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


/*
*
* Approach
Normalize Input: Convert the string to lowercase to ensure case-insensitive matching.

Tokenize: Split the string into words using a regular expression (e.g., split("\\W+")) to handle punctuation and whitespace.

Count: Iterate through the resulting words and count occurrences using a HashMap<String, Integer>.

Output: Print each word and its corresponding frequency, skipping empty strings.
*
*
* Time Complexity
O(n): Where n is the length of the input string.

Normalization (lowercasing) takes O(n).

Tokenization (splitting) scans the string once, O(n).

Iterating through all tokens (words) is O(m), where m is the number of words (m ≤ n).

HashMap operations (getOrDefault, put) are O(1) on average.

Overall: O(n)


* Edge Cases
Empty string: Should return no output or an empty map.

Null input: Need explicit handling (e.g., return, throw exception).

Only punctuation/whitespace: Resultant words array may contain only empty strings—should skip them.

Repeating spaces/characters: Regex should handle any contiguous non-word characters.

Upper/lower case: Lowercasing ensures uniformity, but requirement may differ.

Unicode characters: Regex and lowercasing may behave differently for non-ASCII or accented letters.

Apostrophes and hyphenated words: Depending on the regex, may split words like “don’t” or “well-being”; clarify requirements.

Extremely large input: Efficient if memory allows; may consider streaming.
*
*
*
* Interview Follow-Up Questions
Should we ignore case sensitivity? What about locale-specific lowercasing?

Should punctuation inside words (e.g., apostrophes, hyphens) be retained or removed?

How do we handle numbers, emojis, or other Unicode symbols?

What output format is desirable? Sorted by word? By frequency? Map, list, etc.?

What if the string is extremely large (e.g., file, stream)? How would you scale?

How would you extend for multiple strings or real-time counting?

What about parallel processing, or using functional programming features?

Can you optimize for frequent words? What data structures would you use?

WIPRO:
*
*
*
* Write a Java Program that counts the frequency of each word in a given sentence using a HashMap
Requirements:
Take a sentence as input (eg., “Java is fun and Java is powerful”)
Store each word as a key in the HashMap and its count as the value
  3. Print the frequency of each word
*
*
*
* */