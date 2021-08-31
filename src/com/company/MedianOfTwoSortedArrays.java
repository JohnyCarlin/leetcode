package com.company;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static double Median(int[] nums1, int[] nums2)
    {
        int n = nums1.length;
        int m = nums2.length;
        if (n > m)
            return Median(nums2, nums1); // Swapping to make A smaller

        int start = 0;
        int end = n;
        int realmidinmergedarray = (n + m + 1) / 2;

        while (start <= end) {
            int mid = (start + end) / 2;
            int leftAsize = mid;
            int leftBsize = realmidinmergedarray - mid;
            int leftA
                    = (leftAsize > 0)
                    ? nums1[leftAsize - 1]
                    : Integer.MIN_VALUE; // checking overflow of indices
            int leftB
                    = (leftBsize > 0) ? nums2[leftBsize - 1] : Integer.MIN_VALUE;
            int rightA
                    = (leftAsize < n) ? nums1[leftAsize] : Integer.MAX_VALUE;
            int rightB
                    = (leftBsize < m) ? nums2[leftBsize] : Integer.MAX_VALUE;

            // if correct partition is done
            if (leftA <= rightB && leftB <= rightA) {
                if ((m + n) % 2 == 0)
                    return (Math.max(leftA, leftB)
                            + Math.min(rightA, rightB))
                            / 2.0;
                return Math.max(leftA, leftB);
            }
            else if (leftA > rightB) {
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return 0.0;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 6 };
        int[] arr2 = { 2,3,4,7,8 };
        System.out.println("Median of the two arrays are");
        System.out.println(Median(arr1, arr2));
    }
}



