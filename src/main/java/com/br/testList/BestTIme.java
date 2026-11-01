package com.br.testList;

class Solution {
    public int maxProfit(int[] prices) {
        // verificar o menor valor pra comprar
        // depois verificar o maior valor para vender
        // fazer venda menos compra e retornar


        int cont = 0;

//        if (prices == null || prices.length == 0) {
//            return 0;
//        }

        for (int i = 0; i < prices.length; i++) {
            int menorPreco = prices[i];
            if (menorPreco > prices[i]) {
                System.out.println(menorPreco);
            }

        }
        for(int i = 1; i < prices.length; i++) {
            int menorPreco = prices[i];
            if (prices[i] - menorPreco > cont) {
                cont = prices[i] - menorPreco;
                System.out.println(prices[i] - menorPreco);
            }
            int lucro = prices[i] - menorPreco;
        }
        System.out.println(prices[prices.length - 1]);

        return prices [prices.length - 1] - cont;
    }
}

public class BestTIme {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(s.maxProfit(prices));

    }
}