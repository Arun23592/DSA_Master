package STRING;

public class ReverseEachWordInsentence {

    public static void main(String[] args){
        String str = "You cant see me";
        String[] words = str.split(" ");

        String result = "";

        for(String word : words){
            String reversed = "";

            for (int i=word.length()-1; i>=0; i--){
                reversed += word.charAt(i);
            }

            result += reversed + " ";
        }

        System.out.println("Reverse each word: "+result.trim());
    }




}
