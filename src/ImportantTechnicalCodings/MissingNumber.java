package ImportantTechnicalCodings;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 5, 6, 10};

        int n=10;

        Set<Integer> set = new HashSet<>();

        for(int num: arr){
            set.add(num);
        }

        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                System.out.println(i);
                break;
            }
        }
    }
}


/**
 *
 * find the missing number in a given array arr = {1, 2, 3, 5, 6, 10};
 * */