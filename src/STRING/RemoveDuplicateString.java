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


/*
*
* ✅ APPROACH
The program removes duplicate characters from a string while preserving insertion order.

It uses a LinkedHashSet (ordered set), which:

Removes duplicates automatically.

Maintains insertion order.

Final result is built by iterating through the LinkedHashSet.

⚡️ TIME COMPLEXITY
Iteration of the input string: O(n).

Inserting into LinkedHashSet: O(1) average per insertion.

Final iteration over the set: O(k) where k is the number of unique characters.

Final Complexity ~= O(n)

💾 SPACE COMPLEXITY
The LinkedHashSet can hold at most k unique characters.

Final Space Complexity ~= O(k), where k <= 256 (all possible characters).

🔍 STEP‑BY‑STEP EXPLANATION
Input: "programming"

1️⃣ Initialize an empty LinkedHashSet<Character>:
set = {}

2️⃣ Loop over each character:
p ➔ {p}

r ➔ {p, r}

o ➔ {p, r, o}

g ➔ {p, r, o, g}

r ➔ already present, skip

a ➔ {p, r, o, g, a}

m ➔ {p, r, o, g, a, m}

m ➔ already present, skip

i ➔ {p, r, o, g, a, m, i}

n ➔ {p, r, o, g, a, m, i, n}

g ➔ already present, skip

3️⃣ Final LinkedHashSet:
[p, r, o, g, a, m, i, n]

4️⃣ Build the Result String:
Result = "progamin"

✅ EXAMPLE OUTPUT
Input: programming
Output: progamin

🧪 TEST CASES
Input	Output
programming	progamin
hello	helo
aaaaa	a
abab	ab
123321	123
!@!!@@	!@
`` (empty)	`` (empty)

❓ POTENTIAL INTERVIEW QUESTIONS
What are the benefits of using a LinkedHashSet over a HashSet?

What is the time and space complexity of this approach?

Could you implement this using an array instead? What would be the trade‑offs?

Will this method work for Unicode strings?

What are some ways to remove duplicates from a string in Java?

Could you implement this in place, without using additional data structures?

What about removing duplicates while preserving order, in a single pass?


*
*
* */