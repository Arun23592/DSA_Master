package STRING;

public class reverseWordsPreserveSpecial {


    public  static  String reverseWordsKeepspecialChars(String str){

        char[] chars = str.toCharArray();

        int left = 0, right = chars.length;

        while (left < right){

            while (!Character.isLetterOrDigit(chars[left])){
                left++;
                continue;
            }

            int wordStart = left;
            while (left < right && Character.isLetterOrDigit(chars[left])){
                left++;
            }

            int wordEnd = left - 1;

            int i = wordStart, n = wordEnd;
            while (i < n){
                char temp = chars[i];
                chars[i] = chars[n];
                chars[n] = temp;
                i++;
                n--;
            }

        }

        return new String(chars);
    }
    public static void main(String[] args){
        String str = "Hello@World#Java";

        String result = reverseWordsKeepspecialChars(str);
        System.out.println(result);
    }
}

/**
 *
 * Q: Reverse a string of words by splitting it where we find special character & ensure special character position is intact.
 *
 * Approach 1 — Two-Pointer (Most Efficient) ✅

 *
 *
 *
 *
 * */