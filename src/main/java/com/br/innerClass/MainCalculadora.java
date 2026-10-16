package com.br.innerClass;

public class MainCalculadora {
    public static void main( String[] args ){
        Calculadora calc = new Calculadora();
        calc.setValor1(10);
        calc.setValor2(30);
        int resultado = calc.somar();
        System.out.println(resultado);
    }
}
