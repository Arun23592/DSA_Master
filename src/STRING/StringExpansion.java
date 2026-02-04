package STRING;

public class StringExpansion {

    public static String expandString(String str){
        if(str == null || str.isEmpty()){
            return "";
        }

        StringBuilder result = new StringBuilder();

        int length = str.length();

        for (int i=0; i<length; i++){
            char currentChar = str.charAt(i);
            int count = 0;
            while (i+1 < length && Character.isDigit(str.charAt(i+1))){
                count = count * 10 + (str.charAt(++i) - '0');
            }

            for (int j=0; j<count; j++){
                result.append(currentChar);
            }

        }
        return result.toString();



    }

    public static void main(String[] args){
        String str = "a3b4c5";
      String expand = expandString(str);
        System.out.println("String Expansion :" +expand);
    }
}
