package STACK;

import java.util.Stack;

public class BalancedBrackets {

    public  static boolean bracketsBalanced(String s){

        //1. implement the stack --> LIFO
        Stack<Character> stack = new Stack<>();

        for (char ch: s.toCharArray()){

            //2. if brackets are open, push to stack
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    return false;
                }
            }


        }

        return  true;
    }


    public static void main(String[] args){
        String s = "()[][]{}";
        boolean result = Boolean.parseBoolean(String.valueOf(bracketsBalanced(s)));
//        System.out.println(result);
        if(result){
            System.out.println("Balanced Brackets: "+result);
        }else {
            System.out.println("Not a Balanced Brackets");
        }
    }
}
