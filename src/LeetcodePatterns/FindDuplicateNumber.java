package LeetcodePatterns;

public class FindDuplicateNumber {

    public int findDuplicates(int[] nums){
        int left = 1;
        int right = nums.length-1;
        int duplicates = -1;

        while (left<= right){
            int mid = left +(right - left)/2;

            int count = 0;
            for (int num: nums){
                if (num <= mid){
                    count++;
                }
            }

            if (count > mid){
                duplicates =mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return duplicates;
    }

    public static void main(String[] args){
        int[] nums = {1,3,4,2,2};
        FindDuplicateNumber dup = new FindDuplicateNumber();
        System.out.println("Duplicate Number: "+dup.findDuplicates(nums));
    }
}
