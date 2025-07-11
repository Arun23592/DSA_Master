package ImportantTechnicalCodings;

public class FindCountOddEvenNumbers {

    public static void main(String[] args){
        int number = 1234;

        int evenCount = 0;
        int oddCount = 0;

        int temp = number;

        while(temp != 0){
            int digit = temp % 10;
            if(digit % 2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }

            temp = temp / 10;
        }

        System.out.println("Even numbers: "+evenCount);
        System.out.println("Odd numbers: "+oddCount);
    }
}


/*
* ✅ Approach:
Extract each digit using % 10.

Check if it's even or odd using % 2.

Use / 10 to remove the last digit.

Repeat until the number becomes 0.
*
*
* ✅ Time & Space Complexity:
Metric	Value
Time Complexity	O(d) → d = number of digits
Space Complexity	O(1) → constant extra space
*
*
* ✅ Interview Follow-up Questions:
How would you handle negative numbers?
👉 Use: Math.abs(number)

How would you count even/odd digits in BigInteger?

Can you solve using recursion?

Can you calculate percentage of even/odd digits?
*
*
* ✅ Interview-Ready Answer:
“To count even and odd digits, I use a loop that extracts each digit using % 10, checks parity using % 2, and strips off the last digit using / 10.
* I maintain counters for both even and odd digits. This solution runs in O(d) time and constant space, where d is the number of digits.”
*
*
* */