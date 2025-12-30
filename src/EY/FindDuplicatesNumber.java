package EY;

import java.util.HashSet;

public class FindDuplicatesNumber {

    public static void findDuplicatesNumbers(int[] array){


        HashSet<Integer> seen = new HashSet<>();

        HashSet<Integer> duplicates = new HashSet<>();

        for(int num: array){
            if(seen.contains(num)){
                duplicates.add(num);
            }else {
                seen.add(num);
            }
        }


        if(duplicates.isEmpty()){
            System.out.println("No duplicates Found: "+duplicates);
        }else{
            System.out.println("Duplicates are found: "+duplicates);
        }
    }

    public static void main(String[] args){
        int[] array = {1, 2, 3, 3, 4, 5, 5};
        findDuplicatesNumbers(array);
    }
}
