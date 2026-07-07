package EY;

import java.util.ArrayList;
import java.util.List;

public class generatePattern {

    public static List<Integer> generatePatterns(int n1, int n2){
        int step = n2;

        List<Integer> result = new ArrayList<>();

        while (n1 > n2){
            result.add(n1);
            result.add(n2);


            n1 -= step;
            n2 += step;
        }

        return result;
    }


    public static void main(String[] args){
        List<Integer> output = generatePatterns(100, 10);
        System.out.println(output);

    }
}

/***
 *
 *EY interview question:
 * Generate Alternating Number pattern
 * Inputs:
 * Input1 = 100;
 * Input2 = 10;
 *
 * Output:
 * 100, 10, 90, 20, 80, 30, 70, 40, 60, 50

 * How it works?

 * We print input1, imput2 and then decrease input1 by 10
 * And increase input2 by 10 until input1 > input2
 */