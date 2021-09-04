package com.company;

public class LongestPalindromicSubstring {
    public static  String longestPalindrome(String s) {
        int stringLength = s.length();
        if (stringLength == 1) return s;
        String biggestPalindrome = s.substring(0,1);

        for (int i = 0; i < stringLength; i++) {
            for (int j = stringLength - 1; j > i; j--) {
                String substring = s.substring(i, j+1);
                if (checkIfPalindrome(substring)) {
                    if (substring.length() > biggestPalindrome.length()) {
                        biggestPalindrome = substring;
                    }
                }
            }
        }
        return biggestPalindrome;
    }

    public static boolean checkIfPalindrome(String s) {
        StringBuilder sbr = new StringBuilder(s);
        return sbr.reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("mwwfjysbkebpdjyabcfkgprtxpwvhglddhmvaprcvrnuxifcrjpdgnktvmggmguiiquibmtviwjsqwtchkqgxqwljouunurcdtoeygdqmijdympcamawnlzsxucbpqtuwkjfqnzvvvigifyvymfhtppqamlgjozvebygkxawcbwtouaankxsjrteeijpuzbsfsjwxejtfrancoekxgfyangvzjkdskhssdjvkvdskjtiybqgsmpxmghvvicmjxqtxdowkjhmlnfcpbtwvtmjhnzntxyfxyinmqzivxkwigkondghzmbioelmepgfttczskvqfejfiibxjcuyevvpawybcvvxtxycrfbcnpvkzryrqujqaqhoagdmofgdcbhvlwgwmsmhomknbanvntspvvhvccedzzngdywuccxrnzbtchisdwsrfdqpcwknwqvalczznilujdrlevncdsyuhnpmheukottewtkuzhookcsvctsqwwdvfjxifpfsqxpmpwospndozcdbfhselfdltmpujlnhfzjcgnbgprvopxklmlgrlbldzpnkhvhkybpgtzipzotrgzkdrqntnuaqyaplcybqyvidwcfcuxinchretgvfaepmgilbrtxgqoddzyjmmupkjqcypdpfhpkhitfegickfszermqhkwmffdizeoprmnlzbjcwfnqyvmhtdekmfhqwaftlyydirjnojbrieutjhymfpflsfemkqsoewbojwluqdckmzixwxufrdpqnwvwpbavosnvjqxqbosctttxvsbmqpnolfmapywtpfaotzmyjwnd"
        ));
//        System.out.println(checkIfPalindrome("babad"));
    }

}
