package STRING;

public class FindLargestWord {

    public static String largestWord(String s){
        String[] word = s.split(" ");
        String result = "";

        for (String  ch: word){
            if (ch.length() > result.length()){
                result = ch;
            }
        }
        return result;
    }

    public static void main(String[] args){
        String s = "Welcome to cognizant interview process";
        String largestWord = largestWord(s);
        System.out.println("Largest word: " +largestWord);
    }
}
