package ImportantTechnicalCodings;

public class FindArmstrongNumber {

    public static void main(String[] args){
        int number = 154;
        int originalNumber = number;
        int result = 0;


        while(number != 0){
            int digit = number % 10;
            result += Math.pow(digit, 3);
            number /= 10;
        }

        if(result == originalNumber){
            System.out.println("Yes");
            System.out.println(originalNumber+ " is an armstrong number");
        }else {
            System.out.println("No");
            System.out.println(originalNumber+ " is not an armstrong number");
        }
    }
}

/*

✅ What is an Armstrong Number?
A number is an Armstrong number if:

Sum of cubes of its digits = The number itself
(For 3-digit numbers, cube each digit and sum them)

Example:
153 →
1³ + 5³ + 3³ = 1 + 125 + 27 = 153 ✅



✅ Interview Variations:
Write a function that checks Armstrong for n-digit numbers.

Use Math.pow(digit, countOfDigits)

For 9474: 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474

Modify for n-digit input:

java
Copy
Edit
int digits = String.valueOf(originalNumber).length();
result += Math.pow(digit, digits);
Print all Armstrong numbers from 1 to 1000.

What if the number is negative?

Add a validation check for negatives.


“This code checks whether a number is an Armstrong number by summing the cubes of its digits and comparing it with the original number.
 It uses a while loop to extract digits and calculate powers using Math.pow(). The time complexity is O(d), where d is the number of digits.
 This approach works well for 3-digit numbers and can be extended to n-digit Armstrong numbers by adjusting the power used.”

✅ Interview Variations:
Write a function that checks Armstrong for n-digit numbers.

Use Math.pow(digit, countOfDigits)

For 9474: 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474

Modify for n-digit input:

java
Copy
Edit
int digits = String.valueOf(originalNumber).length();
result += Math.pow(digit, digits);
Print all Armstrong numbers from 1 to 1000.

What if the number is negative?

Add a validation check for negatives.




*
 */