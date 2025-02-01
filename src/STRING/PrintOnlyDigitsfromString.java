package STRING;

public class PrintOnlyDigitsfromString {

    public static void main(String[] args){
       String[] S = {"USD 89,989.00","INR 679,76.899"};



       for (String str: S){
           StringBuilder digitsOnly = new StringBuilder();

           for (char ch: str.toCharArray()){
               if (Character.isDigit(ch)){
                   digitsOnly.append(ch);
               }else if (ch == '.'){
                   break;
               }
           }
           System.out.print(digitsOnly+ ", ");














           ?
    }



}





//Input: S1 = {"USD 89,989.00","INR 679,76.899"}

//Output: 89989, 67976