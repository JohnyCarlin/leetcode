package com.company;

public class MyAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("-2147483647"));
    }

    public static int myAtoi(String s) {
        int i = 0;
        boolean belowZero = false;

        s = s.strip();

        if (s.isEmpty()) {
            return 0;
        }

        if (s.charAt(i) == '-') {
            belowZero = true;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        long result = 0L;

        for (; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                result *= 10;
                result += Character.getNumericValue(s.charAt(i));
                if (result > Integer.MAX_VALUE) {
                    return belowZero ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            } else {
                break;
            }
        }

        if (belowZero) {
            result *= -1;
        }
        return (int) result;
    }
}
