package ImportantTechnicalCodings;

public class CountNumberOfDigitsinNumber {

    public static void main(String[] args){
        int number = 12345;  // Step 1: Input number
        int count = 0;

        int temp = number;

        if(temp == 0){
            count = 1;
        }else {
            while (temp != 0){
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("No of  digits are =  "+ count);
    }
}


/*
*
* // Step 1: Input number
* // Step 2: Variable to store digit count
* // Step 3: Create a temporary copy for processing
* // Step 4: Special case for 0
* // 0 has exactly one digit
* // Step 5: Loop while digits remain
* // Step 6: Remove the last digit
* // Step 7: Increment digit count
*
*"✅ Approach
You can count digits in two main ways:

1. Iterative Division Method (Optimal and interview-friendly)
Keep dividing the number by 10 and count how many times you can do it before it becomes 0."
*
*
*
* ✅ Interview Follow-Up Questions
Can you do this using String conversion?

java
Copy
Edit
int count = String.valueOf(number).length();
What happens if number is negative?

Handle with: Math.abs(number)

How would you count digits of a large number like BigInteger?

Write a recursive version?
*
*
*
* */