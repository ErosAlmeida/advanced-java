package com.br.lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Aplicacao {
    public static void main( String[] args ) {
        List<String> nomes = Arrays.asList("Alfredo", "joane", "richard");

        nomes.forEach(System.out::println);
    }
}
