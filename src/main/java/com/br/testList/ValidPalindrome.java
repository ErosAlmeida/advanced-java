package com.br.testList;

import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "");;
        if (s.length() <= 1) {
            return true;
        }

        String testPolindromo = s.toUpperCase();
        ArrayList <Character> first = new ArrayList<>();
        ArrayList <Character> second = new ArrayList<>();

        for (int i = testPolindromo.length()-1; i >= 0; i--) {
                    second.add(testPolindromo.charAt(i));
        }

        for (int i = 0; i < testPolindromo.length(); i++) {
            first.add(testPolindromo.charAt(i));
        }

        for (int i = 0; i < first.size(); i++) {
            if (first.get(i) != second.get(i)) {
                return false;
            }
        }

        return true;
    }
}
public class ValidPalindrome {
    public static void main(String[] args) {

        Solution s = new Solution();
        boolean result = s.isPalindrome("0p");
        System.out.println(result);
    }
}