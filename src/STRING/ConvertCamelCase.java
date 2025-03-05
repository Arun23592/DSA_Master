package STRING;

public class ConvertCamelCase {

    public static String cameCase(String str){

        if (str == null || str.isEmpty()){
            return "";
        }

        String[] words = str.split("[^a-zA-z]+");
        StringBuilder results = new StringBuilder();

        for (int i=0; i<words.length; i++){
            String word = words[i].toLowerCase();
            if (i == 0){
                results.append(word);
            }else {
                results.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
            }
        }

        return results.toString();
    }




    public static void main(String[] args){
        String str = "cats AND*Dogsare Awesome";
       String cCase = cameCase(str);
        System.out.println(cCase);


    }
}
