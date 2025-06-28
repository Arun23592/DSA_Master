package STRING;

import java.util.HashSet;

public class FindDuplicates {

        public static void findDuplicates(int[] array) {

            HashSet<Integer> seen = new HashSet<>();
            HashSet<Integer> duplicates = new HashSet<>();

            for (int num : array) {
                if (seen.contains(num)) {
                    duplicates.add(num);
                } else {
                    seen.add(num);
                }
            }

            if (duplicates.isEmpty()) {
                System.out.println("No duplicates found");
            } else {
                System.out.println("Duplicates: " + duplicates);
            }
        }
        public static void main(String[] args){
            int[] array = {1, 2, 3, 3, 4, 5, 5};
            findDuplicates(array);
        }



}


/*
*
* ✅ APPROACH
The approach uses two HashSets:

seen: To track numbers we’ve encountered.

duplicates: To capture numbers that appear more than once.

⚡️ TIME COMPLEXITY
The loop goes through each element once ➔ O(n).

contains() and add() in a HashSet average O(1).

Final Complexity ~= O(n).

💾 SPACE COMPLEXITY
seen can hold at most n elements.

duplicates can also be at most n in the worst case.

Final Space Complexity ~= O(n).

🔍 STEP‑BY‑STEP EXPLANATION
Input: array = [1, 2, 3, 3, 4, 5, 5]

1️⃣ Initial State:
seen = {}

duplicates = {}

2️⃣ Iterate Through Array:
1: Not in seen ➔ seen = {1}

2: Not in seen ➔ seen = {1,2}

3: Not in seen ➔ seen = {1,2,3}

3: Already in seen ➔ duplicates = {3}

4: Not in seen ➔ seen = {1,2,3,4}

5: Not in seen ➔ seen = {1,2,3,4,5}

5: Already in seen ➔ duplicates = {3,5}

3️⃣ Final Result:
duplicates = [3, 5]

✅ EXAMPLE OUTPUT
For input: 1, 2, 3, 3, 4, 5, 5
Output:

makefile
Copy
Edit
Duplicates: [3, 5]
🧪 TEST CASES
Input	Output
[1,2,3,3,4,5,5]	Duplicates: [3, 5]
[1,1,1,1]	Duplicates: [1]
[1,2,3,4,5]	No duplicates found
[]	No duplicates found
[9,9,8,7,7,7,7]	Duplicates: [9, 7]

❓ POTENTIAL INTERVIEW QUESTIONS
What is the time and space complexity of this approach?

Could this be implemented without using a HashSet?

What if the array is very large? Will this approach still be efficient?

What if you had to find all indexes of duplicate elements?

How would you adapt this method for a stream of numbers?

What approach would you use if the array was sorted? (Hint: Two‑pointers)

What are alternatives if you have memory constraints?


*
*
*
* */