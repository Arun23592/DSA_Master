package ImportantTechnicalCodings;

public class FindPrimeNumbersRange {


    public static boolean primeNumberRange(int num){
        if(num <= 1) return false;

        for(int i=2; i<=Math.sqrt(num); i++){
            if (num % i == 0)
                    return false;
        }
        return true;
    }
    public static void main(String[] args){
        int start = 2;
        int end = 10;

        System.out.println("Prime numbers between " + start + " and " + end + " are: ");
        for (int i=start; i<=end; i++){
            if(primeNumberRange(i))
                System.out.println(i+ " ");
        }
    }
}


/*
*
* ✅ Approach
To check if a number is prime, it should:

Be greater than 1

Have no divisors other than 1 and itself

We'll:

Loop from start to end

Check if each number is prime using a helper method
*
* ✅ Step-by-Step Explanation
Loop from start (2) to end (10)

For each number:

If it's <= 1, it's not prime

Check divisibility from 2 to √num (optimization)

If no divisors found ➜ prime!

    ✅ Time and Space Complexity
    Operation	Complexity
    isPrime check	O(√n)
    Overall for range	O(n√n)
    Space	O(1)
*
*
*
* ✅ Interview Follow-Up Questions
Can you optimize for large ranges? (→ Use Sieve of Eratosthenes)

What is the time complexity of your solution?

Can you return the result as a List instead of printing?

Can you write a function to count prime numbers up to n?

How would you handle very large numbers efficiently?


*
*
*
* */