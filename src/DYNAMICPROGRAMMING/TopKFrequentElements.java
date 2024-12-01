package DYNAMICPROGRAMMING;

import java.util.*;

public class TopKFrequentElements {

    public static List<Integer> topKFrequent(int[] nums, int k){
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num: nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+ 1);
        }

        //Step 2: Use a priority queue to keep track of the top k frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue()
        );

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            heap.add(entry);
            if (heap.size() > k){
                heap.poll();
            }
        }

        List<Integer> topKElements = new ArrayList<>();
        while (!heap.isEmpty()){
            topKElements.add(heap.poll().getKey());
        }

        Collections.reverse(topKElements);
        return topKElements;
    }

    public static void main(String[] args){
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3};
        int k = 2;
        List<Integer> result = topKFrequent(nums, k);
        System.out.println(result);
    }
}
