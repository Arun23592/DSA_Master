package EY;

public class PalindromeCheck {

    public static boolean isPalindrome(String input){

        String str = input.toLowerCase();
        String s  = str.replaceAll("[a-zA-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;


        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
               return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args){
        String input = "Madam";
        boolean result = isPalindrome(input);
        System.out.println(result);
    }
}
