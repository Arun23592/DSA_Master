package EPAM;

import java.util.HashMap;
import java.util.Map;

public class FindAverageUsingHashMap {

    public static void main(String[] args){
        Map<String, Integer> data = new HashMap<>();

        data.put("Brian", 21);
        data.put("Lee", 22);
        data.put("Cathe", 45);

        System.out.println(data);

        int sum = 0;
        int count = data.size();
        for (int val: data.values()){
            sum += val;
        }

        double average = (double) sum / count;
        System.out.println("Average :"+average);
    }
}



/*
*
* Write a code using HashMap


Brian – 21
Lee – 22
Cathe – 45

Using key and value and find the average?
*
* */