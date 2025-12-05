package STRING;

public class ExtractAndSumNumbers {
    public static void main(String[] args){
        String input = "A45r5u50n";

        int sum = 0;

        StringBuilder number = new StringBuilder();

        for (char ch: input.toCharArray()){
            if (Character.isDigit(ch)){
                number.append(ch);
                System.out.print(number);
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
        System.out.println(" Sum of numbers: "+sum);
    }
}

/*
* Congnizant Interview Question
*
* input: 123qwerS23we5
*
* Asked in Wipro
* //input = "A45r5u50n"
    //output = "Arun 100"
* */