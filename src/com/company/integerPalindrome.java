package com.company;

public class integerPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindromeNoStringsAttached(0));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        StringBuilder sbr = new StringBuilder(s);
        return sbr.reverse().toString().equals(s);
    }

    public static boolean isPalindromeNoStringsAttached(int x) {
        int temp = x;
        int reversed = 0;

        while(x > 0) {
            reversed = (reversed*10) + x%10;
            x /= 10;
        }
        return temp == reversed;
    }


}
