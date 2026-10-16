package com.br.lambda;

public class CalculatorMain {
    public static void main( String[] args ) {
//        Calculator calc = new Calculator() {
//            @Override
//            public void calculate(int x) {
//                x = x * x;
//                System.out.println(x);
//            }
//        };
        Calculator calc = e -> {
            e = e * e;
            System.out.println(e);
        };

        calc.calculate(5);
    }
}
