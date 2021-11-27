package com.company;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestPrefix(strs));
    }

    public static String longestPrefix(String[] strs) {
        String result = "";
        if (strs.length < 1) {
            return result;
        }
        int minLength = Integer.MAX_VALUE;
        for (String s: strs
             ) {
            if (s.length() < minLength) {
                minLength = s.length();
            }
        }

        for (int i=0; i<minLength; i++) {
            boolean flag = true;
            char letter = strs[0].charAt(i);
            for (String s: strs
                 ) {
                if (s.charAt(i) != letter) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result += letter;
            } else {
                break;
            }
        }

        return result;
    }
}
