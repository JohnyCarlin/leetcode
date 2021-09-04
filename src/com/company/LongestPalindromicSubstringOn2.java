package com.company;

public class LongestPalindromicSubstringOn2 {
    public static  String longestPalindrome(String s) {

        int maxLength = 1;
        int start = 0;
        int len = s.length();
        int low, high;

        for (int i = 1; i < len; ++i) {
            low = i - 1;
            high = i;
            while (low >= 0 && high < len
                    && s.charAt(low)
                    == s.charAt(high)) {
                --low;
                ++high;
            }

            ++low; --high;
            if (s.charAt(low) == s.charAt(high) && high - low + 1 > maxLength) {
                start = low;
                maxLength = high - low + 1;
            }

            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < len
                    && s.charAt(low)
                    == s.charAt(high)) {
                --low;
                ++high;
            }

            ++low; --high;
            if (s.charAt(low) == s.charAt(high) && high - low + 1 > maxLength) {
                start = low;
                maxLength = high - low + 1;
            }
        }
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"
        ));
//        System.out.println(checkIfPalindrome("babad"));
    }

}
