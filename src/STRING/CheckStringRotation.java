package STRING;

public class CheckStringRotation {

    public static boolean areRotation(String s1, String s2){
            //1. find the length of the two strings s1 and s2
            if(s1.length() != s2.length()){
                return false;
            }
            //2. concatenate s1 with s1 itself
            String concate = s1 + s1;
            //3. return substring of s2
            return concate.contains(s2);
    }

    public static void main(String[] args){
        String s1 = "abcd";
        String s2 = "cdab";

        boolean result = areRotation(s1, s2);
        System.out.println(result);
    }
}
