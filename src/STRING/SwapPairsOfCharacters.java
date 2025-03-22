package STRING;

public class SwapPairsOfCharacters {

    public static String swapPairs(String str){   //public static method takes a String as input and returns a String
        if(str == null || str.length() < 2){  //if input string is null or less than 2 then return as is.
            return str;
        }

        char[] charArray = str.toCharArray(); //convert string into Character array

        for (int i=0; i<charArray.length-1; i+=2){
            //swap characters at index i and i+1
            char temp = charArray[i];
            charArray[i] = charArray[i+1];
            charArray[i+1] = temp;
        }
        return new String(charArray); //after all strings are swapped, the modified string converted back to a string and returned.
    }

    public static void main(String[] args){

        String input1 = "Mumbai";
        String input2 = "Hyderabad";
        System.out.println(swapPairs(input1));  //uMbmia
        System.out.println(swapPairs(input2));  //yHedarabd
    }
}


//Publicis sapients

//Write  a java code to swap string
//Swap pair of characters in the string:
//e.g.:
//Mumbai => uMbmia
//Hyderabad => yHedarabd


//Approach
//Input Validation:
//
//If the input string is null or has a length less than 2, return the string as-is.
//
//Character Array Conversion:
//
//Convert the string to a character array for in-place modifications.
//
//Pair Swapping:
//
//Iterate through the array in steps of 2.
//
//Swap adjacent characters (e.g., swap charArray[i] and charArray[i+1]).
//
//Return Result:
//
//Convert the modified character array back to a string and return it.


//Time Complexity
//O(n):
//
//The loop runs for n/2 iterations (where n is the string length), and each iteration performs a constant-time swap.
//
//Space Complexity
//O(n):
//
//The character array uses space proportional to the input string length.

