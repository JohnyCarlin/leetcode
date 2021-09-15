package com.company;

public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {

        StringBuilder stb = new StringBuilder();

        while (num  >= 1000) {
            stb.append('M');
            num -= 1000;
        }

        if (num >= 900) {
            stb.append("CM");
            num -= 900;
        }

        while (num >= 500) {
            stb.append('D');
            num -= 500;
        }

        if (num >= 400) {
        stb.append("CD");
        num -= 400;
        }

        while (num >= 100) {
            stb.append('C');
            num -= 100;
        }

        if (num >= 90) {
            stb.append("XC");
            num -= 90;
        }

        while (num >= 50) {
            stb.append('L');
            num -= 50;
        }

        if (num >= 40) {
            stb.append("XL");
            num -= 40;
        }

        while (num >= 10) {
            stb.append('X');
            num -= 10;
        }

        if (num >= 9) {
            stb.append("IX");
            num -= 9;
        }

        while (num >= 5) {
            stb.append('V');
            num -= 5;
        }

        if (num >= 4) {
            stb.append("IV");
            num -= 4;
        }

        while (num >= 1) {
            stb.append('I');
            num -= 1;
        }
        return stb.toString();
    }
}
