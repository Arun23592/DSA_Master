package ImportantTechnicalCodings;

public class FindPrimeNumbers {

    public static boolean primeNumber(int num){
        if(num <= 1) return  false;

        for (int i=2; i<Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        int num = 2;

        if (primeNumber(num)){
            System.out.println(num+ " - is a prime number");
        }else {
            System.out.println(num+ " is not a Prime Number");
        }

    }
}


/*
*
* ✅ What is a Prime Number?
A number is prime if:

It's greater than 1

It has no positive divisors other than 1 and itself

Examples:

✅ Prime: 2, 3, 5, 7, 11

❌ Not Prime: 1, 4, 6, 9, 10
*
*
* ✅ Step-by-Step Explanation
If num <= 1 → Not prime

Loop from 2 to √num

If any number divides num evenly → Not prime

If no such divisor found → Prime
*
*
* ✅ Time and Space Complexity
Metric	Value
Time Complexity	O(√n)
Space Complexity	O(1)
*
*
*
* ✅ Interview Follow-Up Questions
How would you optimize for very large numbers?

Can you write a method to list all primes up to n?

Can you implement this using recursion?

How would you find the nth prime number?

Can you modify the code to work with BigInteger?
*
*
*
* */