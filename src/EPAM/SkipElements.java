package EPAM;

public class SkipElements {

    public static void main(String[] args){
        //16. Int arr 1,2,3,4,5,7,8,9, Skip 3 and all elements after 3 and then skip 7 and then give some
        int[] arr = {1,2,3,4,5,7,8,9};
        for(int i=0; i< arr.length; i++){
            if(arr[i] == 3){
                i += 3; // skip 3 and all elements after 3
            }
            if(i < arr.length){
                if(arr[i] == 7){
                    i += 1; // skip 7
                }
            }
            if(i < arr.length){
                System.out.print(arr[i] + " ");
            }
        }
    }
}


/**
 *
 * public class SkipElements {
 *     public static void main(String[] args) {
 *         int[] arr = {1,2,3,4,5,7,8,9};
 *
 *         for (int num : arr) {
 *             if (num == 3) {
 *                 break; // Skip 3 and everything after
 *             }
 *             if (num == 7) {
 *                 continue; // Skip 7 if encountered (not applicable here)
 *             }
 *             System.out.print(num + " ");
 *         }
 *     }
 * }
 *
 * Output:
 * 1 2
 *
 *
 * You want to:
 *
 * Skip 3 and all elements after 3 → means stop processing once you hit 3.
 * → Result after this step: {1,2}
 *
 * Then skip 7 → but since we already stopped at 3, 7 never comes into play.
 * → Final result: {1,2}
 *
 * ✅ Explanation
 * The loop prints numbers until it hits 3.
 *
 * At 3, the loop breaks → so only 1, 2 are printed.
 *
 * If the array were {1,2,4,5,7,8,9}, then 7 would be skipped using continue.
 *
 *
 *
 *
 * */