package com.br.lambda;

import java.util.Arrays;
import java.util.List;

public class CollectionMain {
    public static void main( String[] args ) {
        List<Integer> list = Arrays.asList(4, 5, 2 , 0 , 1);

       list.forEach(e -> System.out.println(e));
    }


}
