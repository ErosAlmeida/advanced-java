package com.br.reflectionAPi;

public class Televisao {
    public boolean isLigado() {
        return ligado;
    }

    public Televisao(){
        System.out.println("Televisao criada");
    }

    public void ligar (){
        ligado = true;
        System.out.println("Televisao ligada");
    }

    public void desligada(){
        ligado = false;
        System.out.println("Televisao desligada");
    }




    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public Televisao(boolean ligado, int canal) {
        this.ligado = ligado;
        this.canal = canal;
    }

    private boolean ligado;
    private int canal;
}
