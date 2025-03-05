package STRING;

public class ConvertCamelCase {

    public static String cameCase(String str){

        String[] words = str.split("[^a-zA-z]+");
        StringBuilder results = new StringBuilder();

        for (int i=0; i<words.length; i++){
            String word = words[i].toLowerCase();
            if (i == 0){
                results.append(word);
            }
        }
    }




    public static void main(String[] args){
        String str = "cats AND*DogsareAwesome";


    }
}
