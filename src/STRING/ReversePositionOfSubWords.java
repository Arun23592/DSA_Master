package STRING;

public class ReversePositionOfSubWords {

    public static String capitalizeWord(String str){
        if(str == null || str.isEmpty()){
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }


    public static String reverseSubWords(String s){
        String[] strings = s.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i=strings.length-1; i>=0; i--){
            String capitalizeWords = capitalizeWord(strings[i]);
            reversedString.append(capitalizeWords).append(" ");
        }
        return reversedString.toString().trim();
    }

    public static void main(String[] args){
        String s = "India is great";
        String revSub = reverseSubWords(s);
        System.out.println("ReversedSubWords :"+revSub);
    }
}
