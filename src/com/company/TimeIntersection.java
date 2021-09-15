package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeIntersection {

    public static void main(String[] args) {

        int[][] user1 = {{2, 5}, {7, 15}, {20, 25}};
        int[][] user2 = {{3, 4}, {6, 10}, {23, 30}};
        intersect(user1, user2).forEach(array -> System.out.println(Arrays.toString(array)));
    }

    public static List<int[]> intersect(int[][] user1, int[][] user2) {
        List<int[]> resultList = new ArrayList<>();
        int i = 0, j = 0;
        while(i < user1.length && j < user2.length) {
            int lo = Math.max(user1[i][0], user2[j][0]);
            int hi = Math.min(user1[i][1], user2[j][1]);
            if (lo <= hi) {
                resultList.add(new int[]{lo, hi});
            }

            if (user1[i][1] < user2[j][1]) {
                i++;
            }else {
                j++;
            }
        }
        return resultList;
    }
}
