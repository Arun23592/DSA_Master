package ImportantTechnicalCodings;

public class SeparateVowelConsonantSpecial {

    public static void main(String[] args){
        String input = "Hello@123";

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        StringBuilder Digit = new StringBuilder();
        StringBuilder specials = new StringBuilder();


        for(char ch: input.toCharArray()){
            if (Character.isLetter(ch)){
                if("AEIOUaeiou".indexOf(ch) != -1){
                    vowels.append(ch);
                }else {
                    consonants.append(ch);
                }
            } else if (Character.isDigit(ch)) {
                Digit.append(ch);
            }else {
                specials.append(ch);
            }

        }

        String result = vowels.toString() + " " + consonants.toString() + " " + Digit.toString() + " " + specials.toString();
        System.out.println(result);

    }
}
