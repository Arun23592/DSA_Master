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
    }



    public static void main(String[] args){
        String input = "Hello World";

    }
}
