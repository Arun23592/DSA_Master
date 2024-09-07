package STRING;

public class StringCompression {

    public static String compressString(String str){
        //Initialize Variables: Start with an empty result string and initialize a counter.
        if (str == null || str.isEmpty()){
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;
        char currentChar = str.charAt(0);

        //Traverse the String: Loop through the string while keeping track of the current character and its count.
        for (int i =1; i<str.length(); i++){
            if (str.charAt(i) == currentChar){
                count++;
            }else {
                result.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        // Append the last character and its count
        result.append(currentChar).append(count);
        //Return the Result: Finally, return the result string.
        return result.toString();
    }


    public static void main(String[] args){
        String input = "aaaAAAbbbCCCdddd";
        String output = compressString(input);
        System.out.println(output);
    }
}

