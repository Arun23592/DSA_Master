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
 *
 *
 *
 * */