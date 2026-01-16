package comcast;

public class checkPalindromeString {

    public static boolean isPalindrome(String s){
    String str = s.toLowerCase();

    String st = str.replaceAll("[^a-zA-Z0-9]", "");

    int left = 0;
    int right = st.length()-1;

    while(left < right){
        if (st.charAt(left) != st.charAt(right)){
            return false;

        }
        left++;
        right--;
    }
    return true;

    }

    public static void main(String[] args){
        String s = "madam";
        System.out.println(isPalindrome(s));
    }
}
