package STRING;

public class reverseWordsPreserveSpecial {


    public  static  String reverseWordsKeepspecialChars(String str){

        char[] chars = str.toCharArray();

        int left = 0, right = chars.length - 1;

        while (left < right){

            while (left < right && !Character.isLetterOrDigit(chars[left])){
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(chars[right])){
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
    public static void main(String[] args){
        String str = "a@b#c";

        String result = reverseWordsKeepspecialChars(str);
        System.out.println(result);
    }
}
