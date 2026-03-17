package ARRAYS;

public class ReverseFirstLastDigits {

    public static void main(String[] args){
        int num = 12345;
        int original = num;

        //1. Find the last Digit
        int lastDigit = num % 10;

        //2. Find first digit and divisor
        int firstDigit = num;
        int divisor = 1;

        while(firstDigit >= 10){
            firstDigit = firstDigit / 10;
            divisor = divisor * 10;
        }

        //3. Remove First and Last digits
        int middle = (num % divisor) / 10;
        //4. Construct new number
        int result = lastDigit * divisor + middle * 10 + firstDigit;

        // 5: print result
        System.out.println("original number: "+original);
        System.out.println("After swapping  Fist and last: "+result);
    }
}
