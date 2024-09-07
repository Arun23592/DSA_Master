package STRING;

public class ReverseNumber {

    public int reverseNumber(int nums){
        int rev = 0;
        while (nums > 0){
            rev = rev * 10 + nums % 10;
                nums = nums / 10;
        }
        return rev;
    }

    public static void main(String[] args){
        int nums = 1234;
        ReverseNumber reverseNum = new ReverseNumber();
        int reverse = reverseNum.reverseNumber(nums);
        System.out.println("Reversed number:"+reverse);
    }
}
