package com.company;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }

    public static  int reverse(int x) {
        boolean belowZero = false;
        long xLong = x;
        if (x < 0) {
            xLong *= -1;
            belowZero = true;
        }

        long reversedInteger = 0;
        while (xLong/10 >= 1) {
            reversedInteger += xLong%10;
            reversedInteger *= 10;
            xLong /= 10;
        }
        reversedInteger += xLong%10;
        if (belowZero) {
            reversedInteger *= -1;
        }

        if (reversedInteger >= Integer.MIN_VALUE && reversedInteger <= Integer.MAX_VALUE) {
            return (int) reversedInteger;
        }
        return 0;
    }
}
