package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();

//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {i, map.get(target - nums[i])};
            }

            map.put(nums[i], i);
        }
        return new int[2];
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15}, 9)));

//        for (int i = 0; i < array.length; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if (array[i] + array[j] == target) {
//                    System.out.println("[" + i + "," + j + "]");
//                    break;
//                }
//            }
//        }

    }
}
