package Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {

    public static void main(String[] args){

        List<Integer> salaries = Arrays.asList(1000, 2000, 50000, 800000, 900000, 700000);


        Integer secondHighest =
                salaries.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .orElse(null);

        System.out.println(" Second Highest salary is : "+secondHighest);
    }
}


/**
 * Question: Find the second highest salary
 *
 * Approach: using streams
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 *
 *
 * Apply DSA for optimal solution
 *
 *
 * Interview :
 *
 * The stream solution is concise and readable, but its complexity is O(n log n) because it sorts the entire collection.
 * The optimal DSA solution maintains the highest and second-highest values in a single traversal, achieving O(n) time and O(1) space.
 * In production, I would choose based on data size and readability requirements.
 * For interview optimisation questions, I would present the O(n) single-pass solution first and then discuss stream-based alternatives.
 *
 *
 *
 * */