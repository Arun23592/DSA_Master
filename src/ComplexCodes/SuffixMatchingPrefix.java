package ComplexCodes;

public class SuffixMatchingPrefix {


    public static String solve(String[] rows){

        if(rows == null || rows.length == 0) return "";

        StringBuilder result = new StringBuilder();

        //Step 1 : Append the first character of the first row

        result.append(rows[0].charAt(0));

        for(int i=0; i<rows.length; i++){

            char lastChar = rows[i].charAt(rows[i].length()-1);

            if(i < rows.length - 1){
                char nextChar = rows[i+1].charAt(0);

                if (lastChar != nextChar){
                    System.out.println("chain broken at row "+ i
                         +" : last= ' " + lastChar
                         +"' but next starts with '" + nextChar + " ' "
                    );
                    return "INVALID";
                }
            }

            result.append(lastChar);

        }

        return  result.toString();


    }


    public static void main(String[] args){
        String[] match = {"A....*", "*====#", "#____X", "X____Z"};
        System.out.println(solve(match));
    }
}
