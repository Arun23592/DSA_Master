package STRING;

public class ReverseWhilePreserveWhiteSpace {


    public static String reversePreserveSpace(String input){

        char[] result = new char[input.length()];


        //keep space in original position
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == ' '){
                result[i] = ' ';
            }
        }


        int right = input.length() - 1;

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) != ' '){
                while(result[right] == ' '){
                    right--;
                }

                result[right] = input.charAt(i);
                right--;
            }
        }

        return new String(result);
    }



    public static void main(String[] args){
        String input = "Hello World";
        String output = reversePreserveSpace(input);
        System.out.println("White space preserved: "+output);


    }
}


/***
 * Approach: I use a two-pass approach. First I preserve the spaces, then I traverse the input from left to right and place non-space characters from the right side.
 *
 *
 * Complexity
 * Time: O(n)
 * Space: O(n)
 */