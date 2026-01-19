package ImportantTechnicalCodings;

public class ExtractandSumStringNum {

    public static String extractandSumNum(String str){
        StringBuilder sb = new StringBuilder();

        char[] ch = str.toCharArray();

        int sum = 0;
        int num = 0;

        int i = 0;

        for(char c: ch){
            if(Character.isLetter(c)){
                sb.append(c);
            } else if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');

                if(i == str.length() -1 || !Character.isDigit(str.charAt(i+1))){
                    sum += num;
                    num = 0;
                }
            }
            i++;
        }

        return sb.toString() + " " + sum;
    }

    public static void main(String[] args){
            String str = "A45r5u50n";
        String result = extractandSumNum(str);
        System.out.println(result);
    }
}


//input = "A45r5u50n"
//output = "Arun 100"

//Interview question asked in Wipro


/*
* Step-by-Step Execution
Input: "A45r5u50n" → positions: A(0),4(1),5(2),r(3),5(4),u(5),5(6),0(7),n(8).
*
* 1. Setup
* int i = 0;  // Tracks current position
*
* 2. Loop Processing
Char	Pos(i)	Action	num calc	Next char check	sum update
'A'	0	isLetter → sb="A"	-	-	0
'4'	1	isDigit → num=4	Next='5'(digit) → no add		0
'5'	2	isDigit → num=45	Next='r'(letter) → add 45	sum=45	45
'r'	3	isLetter → sb="Ar"	-	-	45
'5'	4	isDigit → num=5	Next='u'(letter) → add 5	sum=50	50
'u'	5	isLetter → sb="Aru"	-	-	50
'5'	6	isDigit → num=5	Next='0'(digit) → no add		50
'0'	7	isDigit → num=50	Next='n'(letter) → add 50	sum=100	100
'n'	8	isLetter → sb="Arun"	-	-	100
3. Key Fix Insight
Old bug: str.indexOf(c) always found first '5' at position 4, so checking position 5 ('u') triggered wrong adds.​

New fix: i+1 uses current position → correct next-char detection.​

4. Return
sb.toString() + " " + sum → "Arun 100" ✓.​
*
*
*
* */