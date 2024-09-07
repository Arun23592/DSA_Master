package STRING;

import java.util.HashSet;

public class FindDuplicates {

        public static void findDuplicates(int[] array) {

            HashSet<Integer> seen = new HashSet<>();
            HashSet<Integer> duplicates = new HashSet<>();

            for (int num : array) {
                if (seen.contains(num)) {
                    duplicates.add(num);
                } else {
                    seen.add(num);
                }
            }

            if (duplicates.isEmpty()) {
                System.out.println("No duplicates found");
            } else {
                System.out.println("Duplicates: " + duplicates);
            }
        }
        public static void main(String[] args){
            int[] array = {1, 2, 3, 3, 4, 5, 5};
            findDuplicates(array);
        }



}
