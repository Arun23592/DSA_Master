package BruteForce;

import java.util.*;

public class MagicTripletsSumisZero {

    public static List<List<Integer>> findMagicTriplets(int[] arr){
        //1. set -> Hashset use to avoid duplicates
        Set<List<Integer>> result = new HashSet<>();
        //2. Find the length of the array
        int n = arr.length;

        //3. iterate for i, j, k
             // pick the first element i
        for (int i=0; i<n-2; i++){
            // pick the second element j
            for (int j=i+1; j<n-1; j++){
                // pick the third element k
                for (int k=j+1; k<n; k++){
                    //check if triplets sum is zero
                    if(arr[i] + arr[j] + arr[k] == 0){


                    List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                    //sort the triplet
                    Collections.sort(triplet);

                    // Add the set to the deduplicate
                    result.add(triplet);

                    }

                }

            }
        }
    //4. convert set to list for return
        return new ArrayList<>(result);
    }



    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = findMagicTriplets(arr);

        System.out.println("Magic triplets sum==0: ");
        for (List<Integer> triplet: triplets){
            System.out.println(triplet);
        }
    }
}
