package ARRAYS;

import java.util.Scanner;

public class FindHCF {

    public static int calculateHCF(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int hcf = calculateHCF(num1, num2);
        System.out.println("HCF of Number "+ num1 + " and " + num2 + "is :" + hcf);
    }
}
