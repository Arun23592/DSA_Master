package ARRAYS;

import java.util.HashSet;
import java.util.Set;

public class NonIdenticalNumber {


    public static Set<Integer> nonIdentical(int[] a1, int[] a2){

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int n: a1){
            set1.add(n);
        }

        for (int n: a2){
            set2.add(n);
        }

        set2.removeAll(set1);

        return set2;
     }
    public static void main(String[] args){
        int[] a1 = {1,2,1,2};
        int[] a2 = {1,1,2,2,3};

        Set<Integer> result = nonIdentical(a1, a2);
        System.out.println("Non identiacal number is: "+result);
    }
}


/**
 * LTIMindtree
 *
 * a1=1,2,1,2
 * a2=1,1,2,2,3
 * print the non-identical number wen compared to both the arrays
 *
 *
 *
 * */