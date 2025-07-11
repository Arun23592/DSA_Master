package ImportantTechnicalCodings;

public class FindFactorialNumber {


    public static void main(String[] args){
        int num = 5;

        int result = 1;

        for(int i=2; i<=num; i++){
            result *= i;
        }

        System.out.println("Factorial number of "+ num + " is : "+result);
    }
}




/*


✅ What does the code do?
It calculates the factorial of a number n = 5 using an iterative approach (with a for loop).

Factorial (n!) means:
n! = n × (n - 1) × (n - 2) × ... × 1

For n = 5, factorial is:
5! = 5 × 4 × 3 × 2 × 1 = 120

✅ Approach Used:
Iterative Approach (using loop)

Stores result in a long variable to handle larger values (beyond int limit).


✅ Step-by-Step Explanation:
Iteration (i)	factorial (factorial *= i)
1	1 × 1 = 1
2	1 × 2 = 2
3	2 × 3 = 6
4	6 × 4 = 24
5	24 × 5 = 120

So the result is 120.
*
*
* ✅ Interview-Ready Summary Answer:
“This code calculates the factorial of a number using an iterative loop-based approach, which is efficient in both time (O(n)) and space (O(1)).
* The result is stored in a long to accommodate larger values. While this works for most values of n, for very large numbers (like 50 or 100+), we can switch to BigInteger to avoid overflow.
* Alternatively, recursion can be used, though it introduces risk of stack overflow and additional space usage due to the call stack.”
*
*
*
*
* */