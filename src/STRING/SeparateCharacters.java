package STRING;

import java.util.Scanner;

public class SeparateCharacters {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.println("\nEnter the characters");

        String input = sc.next();

        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for (char ch: input.toCharArray()){
            if (Character.isLetter(ch)){
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                digits.append(ch);
            }else {
                specialChars.append(ch);
            }
        }

        System.out.println("\nSeparated the characters");

        System.out.println("Letters: " +letters);
        System.out.println("Digits: " +digits);
        System.out.println("Special characters: " +specialChars);


    }
}
