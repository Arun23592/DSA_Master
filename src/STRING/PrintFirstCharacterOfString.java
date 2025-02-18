package STRING;

public class PrintFirstCharacterOfString {

    public static void main(String[] args){
        String s = "Selenium Automation";
        String[] words = s.split(" ");
        for (String word: words){
            if (!word.isEmpty()){
                System.out.print(word.charAt(1)+ " ");
            }
        }
    }
}

/*
 */