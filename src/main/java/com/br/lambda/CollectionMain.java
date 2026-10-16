package com.br.lambda;

import java.util.Arrays;
import java.util.List;

public class CollectionMain {
    public static void main( String[] args ) {
        List<Integer> list = Arrays.asList(4, 5, 2 , 0 , 1);



       list.sort((x,y) -> x.compareTo(y));

      // list.removeAll(e -> e * 2);
        list.removeIf(e -> e % 2 != 0);
        list.forEach(e -> System.out.println(e));

    }


}
