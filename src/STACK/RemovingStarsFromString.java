package STACK;

import java.util.Stack;

public class RemovingStarsFromString {

    public String removeStars(String s){
        Stack<Character> res = new Stack<>();
        StringBuilder s1 = new StringBuilder();

        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) != '*'){
                res.push(s.charAt(i));
            }else {
                res.pop();
            }
        }

        for (char c: res){
            s1.append(c);
        }
        return s1.toString();
    }

    public static void main(String[] args){
        String s = "leet**cod*e";
        RemovingStarsFromString removeStar = new RemovingStarsFromString();
        String remove = removeStar.removeStars(s);
        System.out.println(remove);
    }
}
