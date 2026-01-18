package comcast;

public class isPrimeNumberRange {

    public static boolean isPrimeNumber(int n){
        if(n <= 1) return false;

        for(int i=2; i*i<=n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int start = 10, end = 50;

        for (int i=start; i<=end; i++){
            if (isPrimeNumber(i)){
                System.out.println(i+ "");
            }
        }
    }
}


/**
 *What is a Prime Number? (Say this in interview)
 *
 * A prime number is a natural number greater than 1 that has exactly two distinct positive divisors: 1 and itself.
 *Approach1: Brute force
 * ⚡ Approach 2: Optimal (√n Optimization) – Interview Favorite
 *🔸 Key Insight
 *
 * A number only needs to be checked till √n.
 *
 * Type	        Value
 * Time	        O(n √n)
 * Space	    O(1)
 *
 *
 *
 *
 *
 * */