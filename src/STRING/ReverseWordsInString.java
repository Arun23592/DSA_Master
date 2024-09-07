package STRING;

public class ReverseWordsInString {

    public String reverseWord(String s){
        String[] str = s.trim().split("\\s+");
        String rev = "";

        for(int i=str.length-1; i>0; i--){
            rev += str[i] + " ";
        }
        return rev + str[0];
    }

    public static void main(String[] args){
        String s = "  hello world  ";
        ReverseWordsInString reverse = new ReverseWordsInString();
        String reversedString = reverse.reverseWord(s);
        System.out.println("Reversed word is: "+reversedString);
    }
}
