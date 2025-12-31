package STRING;

public class RemoveDigitFromNumberToMaximizeResult {

    public static String removeDigit(String number,  char digit){
        //1. Initialize empty string
        String maximizeResult = "";

        for (int i=0; i<number.length(); i++){
            if(number.charAt(i) == digit){
                String newNumber = number.substring(0, i) + number.substring(i+1);
                if(newNumber.compareTo(maximizeResult) > 0){
                    maximizeResult = newNumber;
                }
            }
        }
        return maximizeResult;
    }

    public static void main(String[] args){
        String number = "551";
        char digit = '5';
        System.out.println("RemoveDigitFromNumberToMaximizeResult: "+removeDigit(number, digit));
    }
}
