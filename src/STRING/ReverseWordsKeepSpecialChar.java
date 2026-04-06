package STRING;

public class ReverseWordsKeepSpecialChar {

    public static String reverseKeepSpecial(String input){


        char[] arr = input.toCharArray();
        int left = 0;
        int right = arr.length - 1;


        while(left < right){
            if(!Character.isLetterOrDigit(arr[left])){
                left++;
            }else if(!Character.isLetterOrDigit(arr[right])){
                right--;
            }else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);

    }

    public static void main(String[] args){
        String input = "ab-cd!ef";
        System.out.println(reverseKeepSpecial(input));
    }
}

/**
 * Approach implemented:
 *
 * Two-pointer technique
 * Skip special characters
 * Swap only letters/digits
 * Time complexity:
 *
 * O(n)
 * Space complexity:
 *
 * O(n) because of the char array copy
 * Extra auxiliary logic is O(1)
 *
 *
 *
 * **/