package ImportantTechnicalCodings;

public class FibonacciSeries {

    public static void main(String[] args){
        int n  = 10; // initialize int

        //Start with two variables:
        int first = 0;
        int second = 1;

        System.out.println("fibonacci series till " + n + "terms");

        //Loop n times, each time:
        for (int i=0; i<n; i++){
            System.out.print(first + (i < n - 1 ? "," : " "));  //Print first
            int next = first + second;  //Compute next = first + second
            first = second; // Shift values: first = second, second = next
            second = next;
        }
    }
}


/*
*
* ✅ Time and Space Complexity:
Metric	Value
Time Complexity	O(n)
Space Complexity	O(1)
*
*
* ✅ Interview Questions Follow-ups:
Can you write it using recursion?

What are the drawbacks of recursion in this case?

Can you optimize recursive solution using memoization?

What is the time complexity of recursive Fibonacci?

Can you write a function to return the nth Fibonacci number?

✅ Approach 2: Recursive Method (Not optimal for large n)
*
* public class FibonacciRecursive {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + (i < n - 1 ? ", " : ""));
        }
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}

* ❌ Time Complexity: O(2^n) → exponential
❌ Space Complexity: O(n) (call stack)
✅ Suitable for small n, good for concept clarity, but not efficient.
*
*
* ✅ Final Interview-Ready Summary:
“I implemented the Fibonacci series using an iterative method for optimal time (O(n)) and space (O(1)).
* While recursion demonstrates the mathematical definition clearly, it's inefficient for large inputs.
* To optimize recursive calls, I used memoization with a HashMap, bringing the time complexity down from exponential to linear. In interviews, I prefer starting with the iterative approach for clarity and performance, then discuss optimizations like memoization if needed.”
*
*
* */