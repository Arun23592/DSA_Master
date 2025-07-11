package ImportantTechnicalCodings;

public class FindOddorEvenNumber {

    public static void main(String[] args){

        int number = 2;

        if(number % 2 == 0){
            System.out.println(number+ " is an Odd Number");
        }else {
            System.out.println(number+ " is an even number");
        }
    }
}


/*
* ✅ Step-by-Step Explanation:
int number = 2;
→ Input number is 2

number % 2 == 0
→ Checks if remainder after dividing by 2 is 0
→ If true: it’s even, else odd

In this case:
→ 2 % 2 = 0 → So, prints: Even Number
*
*
* */
