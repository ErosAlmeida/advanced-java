package com.br.testList;

public class Ex01 {
    public static void main( String[] args ) {
        String nome = "Java";

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());

        String palavra = "Java é legal";
        System.out.println(palavra.indexOf("legal"));

        String tema = "java";
        System.out.println(palavra.indexOf("python"));
    }
}
