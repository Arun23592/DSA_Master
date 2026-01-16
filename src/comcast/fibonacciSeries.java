package comcast;

public class fibonacciSeries {

    public static void main(String[] args){
        int n = 10;

        int a = 0, b =1;

        System.out.println(a+ " " + b + " ");

        for (int i=2; i<n; i++){
            int c = a + b;

            a = b;
            b = c;

            System.out.println(c+" ");
        }

    }
}


/**
 *
 *          //Step 1: initialize starts with 0 and 1
 *         //Step 2: calculate Next number is sum of previous two
 *         //Step 3: print output each fibonacci number
 *         //Step 4: continue Repeat until reaching desired output.
 *
 * output:
 *
 * 1 1 2 3 5 8 13 21 34 55
 * */