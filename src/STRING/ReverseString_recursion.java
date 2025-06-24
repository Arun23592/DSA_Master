package STRING;

public class ReverseString_recursion {

    public static String reverseString(String s){
        if(s.isEmpty()){
           return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args){
        String stringInput = "Arun Subramani";
        String ReversedString = reverseString(stringInput);
        System.out.println("Reversed string is: "+ReversedString);
    }

}
