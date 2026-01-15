package comcast;

public class findTriplets {


    public void findTriplets(int[] arr, int target){


        int n = arr.length; //Step 1: find the length of the array
        boolean found = false; //Step 2: check the triplets are found
        //Step 3: using three nested loops
        for(int i =0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    //Step 4: verify if their sum equals the target.
                    if(arr[i]+arr[j]+arr[k] == target){
                        System.out.println(arr[i] + " ," + arr[j] + " ," +arr[k]);
                        found = true;
                    }
                }
            }
        }

        //Step 5: if triplets not found, print no triplets message
        if(!found){
            System.out.println("No triplets found ");
        }

    }
    public static void main(String[] args){
        int[] arr = {2, -3, 5, 6, 7, 9};
        int target = 9;
        findTriplets triplets = new findTriplets();
        triplets.findTriplets(arr, target);

    }
}

/**
 * Approach: Brute Force
 *Steps:
 * Step 1: find the length of the array
 * Step 2: check the triplets are found
 * Step 3: using three nested loops
 * Step 4: verify if their sum equals the target.
 * Step 5: if triplets not found, print no triplets message
 *
 *
 * Alternate approach: sorting + two pointer
 *
 *
 *import java.util.Arrays;
 *
 * class ThreeSumOptimal {
 *
 *     public void findTriplets(int[] arr, int target) {
 *         Arrays.sort(arr); // O(n log n)
 *         int n = arr.length;
 *
 *         for (int i = 0; i < n - 2; i++) {
 *
 *             // Skip duplicates
 *             if (i > 0 && arr[i] == arr[i - 1]) continue;
 *
 *             int left = i + 1;
 *             int right = n - 1;
 *
 *             while (left < right) {
 *                 int sum = arr[i] + arr[left] + arr[right];
 *
 *                 if (sum == target) {
 *                     System.out.println(arr[i] + ", " + arr[left] + ", " + arr[right]);
 *
 *                     left++;
 *                     right--;
 *
 *                     // Skip duplicates
 *                     while (left < right && arr[left] == arr[left - 1]) left++;
 *                     while (left < right && arr[right] == arr[right + 1]) right--;
 *
 *                 } else if (sum < target) {
 *                     left++;
 *                 } else {
 *                     right--;
 *                 }
 *             }
 *         }
 *     }
 *
 *     public static void main(String[] args) {
 *         int[] arr = {2, 3, 5, 6, 7, 9};
 *         int target = 9;
 *
 *         new ThreeSumOptimal().findTriplets(arr, target);
 *     }
 * }
 *
 * */