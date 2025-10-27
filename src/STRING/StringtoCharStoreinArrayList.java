package STRING;

import java.util.ArrayList;
import java.util.List;

public class StringtoCharStoreinArrayList {

    public static void main(String[] args){
        String New = "Welcome to HCL interview";

        String[] word = New.split("");

        List<String> arr = new ArrayList<>();

        for (String ch : word){
            arr.add(ch);
        }
        System.out.println(arr);
    }
}

/*
* Split the string into characters and store it in arraylist
*
* Asked in HCL interview
* */