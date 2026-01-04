package EPAM;

import java.util.HashMap;
import java.util.Map;

interface DataStore{
    Map<Integer, String> map = new HashMap<>();
}
public class HashMapInterface implements DataStore{

    public static void main(String[] args){
        map.put(1, "Arun");
        map.put(2, "QA Automation");
        map.put(3, "SDET role");

        System.out.println("Data stored in the map: ");
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+ " --> "+entry.getValue());
        }

        System.out.println("Values for keys: "+map.get(1));
    }
}
