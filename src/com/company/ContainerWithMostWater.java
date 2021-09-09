package com.company;

import java.util.HashMap;
import java.util.Map;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(maxAreaPointer(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        int result = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                result = Math.max(result, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return result;
    }

    public static int maxAreaPointer(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;

        while(l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxarea;
    }
}
