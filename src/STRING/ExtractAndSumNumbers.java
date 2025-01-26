package STRING;

public class ExtractAndSumNumbers {
    public static void main(String[] args){
        String input = "123qwerS23we5";

        int sum = 0;

        StringBuilder number = new StringBuilder();

        for (char ch: input.toCharArray()){
            if (Character.isDigit(ch)){
                number.append(ch);
            }else {
                if (number.length() > 0){
                    sum += Integer.parseInt(number.toString());
                    number.setLength(0);
                }
            }
        }

        if (number.length() > 0){
            sum += Integer.parseInt(number.toString());
        }
        System.out.println("Sum of numbers: "+sum);
    }
}
