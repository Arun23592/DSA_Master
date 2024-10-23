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