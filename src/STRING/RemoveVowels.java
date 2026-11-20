package STRING;

import java.util.ArrayList;
import java.util.List;

public class RemoveVowels {

    public static void main(String[] args){
        String str = "automation";

        List<Character> list = new ArrayList<>();
        for (char ch: str.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) == -1){
                list.add(ch);
            }
        }
        list.forEach(System.out::print);
    }
}
