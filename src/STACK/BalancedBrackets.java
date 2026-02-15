package STACK;

import java.util.Stack;

public class BalancedBrackets {

    public static String bracketsBalanced(String s){

        //1. implement the stack --> LIFO
        Stack<Character> stack = new Stack<>();

        for (char ch: s.toCharArray()){

            //2. if brackets are open, push to stack
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    return "NO";
                }

                char top = stack.pop();

                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    return "NO";
                }
            }


        }

        return stack.isEmpty() ? "YES" : "NO";
    }


    public static void main(String[] args){
        String s = "()[]{}";
        String result = bracketsBalanced(s);
        System.out.println(result);
        if(!result.isEmpty()){
            System.out.println("Balanced Brackets: "+result);
        }else {
            System.out.println("Not Balanced Brackets");
        }
    }
}
