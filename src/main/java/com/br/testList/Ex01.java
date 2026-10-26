package com.br.testList;

public class Ex01 {

    int strStr(String haystack, String needle) {
        System.out.println(haystack.indexOf(needle));
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {

        String haystack = "leetcode";
        String needle = "leeto";

        Ex01 ex = new Ex01();
        int resultado = ex.strStr(haystack, needle);

        //System.out.println("Resultado: " + resultado);
    }
}
