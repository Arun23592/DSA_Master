package ImportantTechnicalCodings;

public class SwapTwoNumbers {

    public static void main(String[] args){
//        Input: a = 10 b = 20
//        Output: a = 20 b = 10

        int a = 10;
        int b = 20;


        System.out.println("Before Swap: a = "+a + " b= "+ b);


        int temp = a;
        a = b;
        b = temp;

        System.out.println("Before Swap: a = "+a + " b = "+ b);
    }
}

/*
*
* 1. Using a Temporary Variable (Most common & readable)
* ✅ Time Complexity: O(1)
✅ Space Complexity: O(1)
✅ Simple, readable, and safe.
*
*
*  2. Without Temp Variable – Using Arithmetic:
*
* int a = 10;
int b = 20;

a = a + b; // a = 30
b = a - b; // b = 10
a = a - b; // a = 20

*✅ Time Complexity: O(1)
✅ Space Complexity: O(1)
✅ Efficient, but might cause integer overflow if values are very large.
*
*
*
*  3. Without Temp Variable – Using XOR (Bitwise Swap)
*int a = 10;
int b = 20;

a = a ^ b;
b = a ^ b;
a = a ^ b;

* ✅ Time Complexity: O(1)
✅ Space Complexity: O(1)
✅ Safe from overflow, but less readable for beginners.
*
*
* ✅ Interview Perspective
🔸 Common Follow-up Questions:
Can you swap without using a third variable?

Why might the arithmetic method fail in some cases?

What is the advantage of using XOR?

How would you swap two values in a list/array?

How would you swap in Java without using primitive types (e.g., using wrapper classes or objects)
*
*
* ✅ Best Practice (for interviews):
Start with the temp variable method for readability.

Then mention the other two methods and their trade-offs.

Prefer XOR when interviewer asks about optimized or clever solutions.
* */